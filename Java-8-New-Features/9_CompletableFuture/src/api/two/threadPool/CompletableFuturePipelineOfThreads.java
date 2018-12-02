package api.two.threadPool;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeoutException;

public class CompletableFuturePipelineOfThreads {
	
	//creating thread pools
	private static ForkJoinPool fjp1 = new ForkJoinPool(2);
	
	private static ForkJoinPool fjp2 = new ForkJoinPool(3);
	
	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
		//calling executeAdderPipeline() asynchronously to execute in thread pool 1 [fjp1]
		CompletableFuture<Integer> futureAdder = CompletableFuture.supplyAsync(() -> executeAdderPipeline(5), fjp1);
		
		//calling executeDividerPipeline() asynchronously to execute in thread pool 2 [fjp2]
		CompletableFuture<Integer> futureDivider = CompletableFuture.supplyAsync(() -> executeDividerPipeline(100), fjp2);
	
		//obtaining the ultimate processed result
		System.out.println("Adder O/P: " + futureAdder.get());
		System.out.println("Divider O/P: " + futureDivider.get());
	}

	private static int executeAdderPipeline(int inputData) {
		System.out.println("Adder Pipeline Thread: " + Thread.currentThread());
		//creating a pipeline for executing the sequential operations
		CompletableFuture<Integer> adderPipeline = new CompletableFuture<Integer>();
		//storing processed output in terms of CompletableFuture
		CompletableFuture<Integer> futureResult = 
				adderPipeline.thenApply(data -> data + 1)
						     .thenApply(data -> data + 2)
					         .thenApply(data -> data + 3)
						     .thenApply(data -> data + 4)
						     .thenApply(data -> data + 5)
						     .toCompletableFuture();
		//invoking the pipeline to execute
		adderPipeline.complete(inputData);
		//retrieving and return the result of processing
		return getValue(futureResult);
	}
	
	private static int executeDividerPipeline(int inputData) {
		System.out.println("Divider Pipeline Thread: " + Thread.currentThread());
		//creating a pipeline for executing the sequential operations
		CompletableFuture<Integer> dividerPipeline = new CompletableFuture<Integer>();
		//storing processed output in terms of CompletableFuture
		CompletableFuture<Integer> futureResult = 
				dividerPipeline.thenApply(data -> data / 2)
							   .thenApply(data -> data / 5)
							   .thenApply(data -> data / 2)
							   .toCompletableFuture();
		//invoking the pipeline to execute
		dividerPipeline.complete(inputData);
		//retrieving and return the result of processing
		return getValue(futureResult);
	}
	
	private static int getValue(CompletableFuture<Integer> future) {
		try {
			return future.get();
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		return -1;
	}
	
}
