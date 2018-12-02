package api.methods;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/*
 The combine() method is similar to reduce() method in Stream API, it reduces the results of multiple future 
 into a single future by combining their results.
 This combine() method can be chained with multiple completion stages to reduce the ultimate result into a 
 single completion stage.
 */

public class CompletableFutureCombine {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture<Integer> future1 = new CompletableFuture<>();
		CompletableFuture<Integer> future2 = new CompletableFuture<>();
		//Here, first processing with future1 and then combining the result with the result of another process
		//that has called inside the thenCombine() method
		CompletableFuture<Integer> futureResult = process(future1).thenCombine(process(future2), (f1, f2) -> f1 + f2);
		future1.complete(5);
		future2.complete(10);
		System.out.println("Combined Result: " + futureResult.get());
	}

	private static CompletableFuture<Integer> process(CompletableFuture<Integer> future) {
		return future.thenApply(data -> data + 5)
			  .thenApply(data -> data * 2)
			  .thenApply(data -> data / 10)
			  .toCompletableFuture();
	}
}
