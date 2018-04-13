package streamPerformance;

import java.util.ArrayList;
import java.util.List;

//We are going to copy the elements of one list to another list to test performance

public class StreamPerformance {

	public static void main(String[] args) {
		long startTime = 0L;
		long endTime = 0L;
		
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		for (int i = 0; i < 100000; i++) {
			list1.add(i);
		}
		
		//Using Streams
		startTime = System.currentTimeMillis();
		list1.stream().forEach((num) -> list2.add(num));
		endTime = System.currentTimeMillis();
		System.out.println("ForEach Loop using Stream [Execution Time] : " + (endTime - startTime));
		
		list2.clear();
		//Using ParallelStream
		startTime = System.currentTimeMillis();
		list1.parallelStream().forEach((num) -> list2.add(num));
		endTime = System.currentTimeMillis();
		System.out.println("ForEach Loop using Parallel Stream [Execution Time] : " + (endTime - startTime));
		
		System.out.println("Cores: " + Runtime.getRuntime().availableProcessors());
	}

}
