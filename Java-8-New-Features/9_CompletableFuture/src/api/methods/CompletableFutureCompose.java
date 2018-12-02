package api.methods;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/*
The compose() method is similar to flatMap() method in Stream API, it transforms the results of multiple future 
into a single future.
*/

public class CompletableFutureCompose {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture<Integer> future1 = new CompletableFuture<>();
		CompletableFuture<Integer> future2 = new CompletableFuture<>();
		//First combining the results of multiple completion stages and the calling the compose() method to process
		//with the end result by adding some sort of string.
		CompletableFuture<String> futureResult = process(future1)
													.thenCombine(process(future2), (f1, f2) -> f1 + f2)
													.thenCompose(result -> processResult(result));
		future1.complete(5);
		future2.complete(10);
		System.out.println("Compose Result: " + futureResult.get());
	}

	private static CompletableFuture<Integer> process(CompletableFuture<Integer> future) {
		return future.thenApply(data -> data + 5)
			  .thenApply(data -> data * 2)
			  .thenApply(data -> data / 10)
			  .toCompletableFuture();
	}
	
	private static CompletableFuture<String> processResult(Integer result){
		CompletableFuture<String> future = new CompletableFuture<>();
		CompletableFuture<String> futureResult = addString(future);
		future.complete(result.toString());
		return futureResult;
	}
	
	private static CompletableFuture<String> addString(CompletableFuture<String> future) {
		return future
				.thenApply(data -> "Result is being transformed to " + 5)
			    .toCompletableFuture();
	}
}
