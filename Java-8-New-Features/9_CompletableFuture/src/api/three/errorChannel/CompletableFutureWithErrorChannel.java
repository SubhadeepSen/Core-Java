package api.three.errorChannel;

import java.util.concurrent.CompletableFuture;

/*
--> As we CompletableFuture API has to channels, one is for processing, known as Data Channel and other one is for handling error, known as Error Channel.
--> So here we will see the error channel along with data channel in case of exception and how to deal with the error and how we are treating error as data.
--> The exceptionally() method of CompletableFuture API helps to catch the error or exception in a pipeline and transforms the error into error data.
***Note that even though there is error the flow will not break due the that error, it will continue with the other operations.

-----------F--F--F-------------F--F-- Data Channel
Pipeline          \           /
-------------------E--F--E---F-------  Error Channel
*/

public class CompletableFutureWithErrorChannel {

	public static void main(String[] args) {
		CompletableFuture<Integer> future = new CompletableFuture<>();
		process(future);
		
		//*** The main disadvantage of the complete method is that it will wait forever until it gets a response [data or error]
		//*** This disadvantage has been removed in JDK 9 by adding the timeout option. It will wait till the specified time either for response
		//    or error otherwise if does not receives anything, will throw timeoutException
		future.complete(10);
	}

	private static void process(CompletableFuture<Integer> future) {
		future.thenApply(data -> data + 5)
			  .thenApply(data -> data * 2)
			  .thenApply(data -> data / 10)
			  .thenApply(data -> data / 0)
			  .exceptionally(throwable -> handleException(throwable))
			  .thenAccept((data) -> System.out.println("processed data: " + data));
	}

	private static int handleException(Throwable throwable) {
		System.out.println(throwable.getMessage());
		return 400;
	}
}
