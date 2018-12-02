package api.two.threadPool;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/*
When we are performing operations synchronously or in pipeline, it is executing in the same thread. But when we are performing operations
asynchronously then that operation will run in a different thread irrespective of the current thread from where the operation has been called.
 */

public class CompletableFutureDifferentThreads {

	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
		//calling the below functions asynchronously, will run in a different thread irrespective of the main thread here
		CompletableFuture<Integer> futureAdder = CompletableFuture.supplyAsync(() -> adder(5));
		CompletableFuture<Integer> futureMultiplier = CompletableFuture.supplyAsync(() -> multiplier(5));
		CompletableFuture<Integer> futureDivider = CompletableFuture.supplyAsync(() -> divider(20));
	
		//collecting the final out from each of the future objects
		System.out.println("Adder O/P: " + futureAdder.get());
		System.out.println("Multiplier O/P: " + futureMultiplier.get());
		System.out.println("Divider O/P: " + futureDivider.get());
		
	}

	private static int adder(int data) {
		System.out.println("Adder Thread: " + Thread.currentThread());
		return data + 5;
	}
	
	private static int multiplier(int data) {
		System.out.println("Multiplier Thread: " + Thread.currentThread());
		return data * 5;
	}
	
	private static int divider(int data) {
		System.out.println("Divider Thread: " + Thread.currentThread());
		return data / 10;
	}
	
}
