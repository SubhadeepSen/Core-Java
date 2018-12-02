package api.one.create;

import java.util.concurrent.CompletableFuture;

/*
--> CompletableFuture API is an API for executing code Asynchronously/Synchronously without blocking the current Thread.
--> It is similar to Javascript promises.
--> It gives the same value to an error as a data, which means errors are also considered as valid response data.
--> It has to channels, one is for processing, known as Data Channel and other one is for handling error, known as Error Channel.
--> When created, it forms a pipeline of processes and wait till the previous process is not completed without blocking the main thread.
--> Can be called on CompletableFuture object to start the execution.
*** Note calling get() method will block the current thread which is a disadvantage.
*** There is no time-out option for which it waits forever to get at least response as data or error.
*/

public class CreateCompletableFuture {

	public static void main(String[] args) {
		CompletableFuture<Integer> future = new CompletableFuture<>();
		System.out.println(future); // prints CompletableFuture@33909752[Not completed]
		process(future);
		
		//asking to start execution
		future.complete(5);
		System.out.println(future); // prints CompletableFuture@33909752[Completed normally]
	}

	private static void process(CompletableFuture<Integer> future) {
		//forming pipeline of processes
		//runs on same thread as it is a pipeline
		future.thenApply(data -> data + 5)
			  .thenApply(data -> data * 2)
			  .thenApply(data -> data / 10)
			  .thenAccept((data) -> System.out.println("processed data: " + data));
	}
}
