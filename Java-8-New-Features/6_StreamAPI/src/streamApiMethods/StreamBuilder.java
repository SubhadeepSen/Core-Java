package streamApiMethods;

import java.util.stream.IntStream;

public class StreamBuilder {

	public static void main(String[] args) {
		
		//generate a stream of 10 numbers from 1 to 10
		IntStream.range(1, 11).forEach(n -> System.out.print(n +"  "));
		System.out.println();
		
		//generates infinite stream with step size 1
		IntStream.iterate(1, x -> x+1);
		
		//limiting infinite stream to 1000;
		//IntStream.iterate(1, x -> x+1).limit(1000).forEach(n -> System.out.println(n));
		
		//Let us find all the prime numbers within 1000
		IntStream.iterate(1, x -> x+1).limit(1000)
				 .filter(number -> 
				 		 number > 1 && IntStream.range(2, number).noneMatch(i -> number % i == 0)
				  ).forEach(n -> System.out.println(n));
	}
}
