package streamApiMethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethodsExample {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sunny", "Subha", "Deep", "Subhadeep", "Diana");
		List<Integer> numbers = Arrays.asList(4, 1, 3, 5, 3, 1, 2, 4, 2);

		//Methods for Intermediate Operations
		System.out.print("\nFiltering names by starting with 'D' : ");
		names.stream().filter((n) -> n.startsWith("D")).forEach(n -> System.out.print(n + "  "));
		
		System.out.print("\nTransforming names by appending code : ");
		names.stream().map(n -> n + "-123").forEach(n -> System.out.print(n + "  "));
		
		System.out.print("\nDistinct Elements in sorted order : ");
		numbers.stream().distinct().sorted().forEach(n -> System.out.print(n + "  "));
		
		System.out.print("\nLimiting stream to first 2 elements : ");
		names.stream().limit(2).forEach(n -> System.out.print(n + "  "));
		
		System.out.print("\nSkipping first 3 elements in stream : ");
		names.stream().skip(3).forEach(n -> System.out.print(n + "  "));
		
		//Methods for Terminal Operations
		System.out.print("\nReducing distinct elements to total sum : ");
		Integer num = numbers.stream().distinct().reduce((n1, n2) -> (n1+n2)).get();
		System.out.print(num);
		
		System.out.print("\nCollecting distinct elements in a List : ");
		List<Integer> nums = numbers.stream().distinct().collect(Collectors.toList());
		System.out.print(nums);
		
		System.out.print("\nMinimum : ");
		num = numbers.stream().distinct().min(Integer::compare).get();
		System.out.print(num);
		
		System.out.print("\nMaximum : ");
		num = numbers.stream().distinct().max(Integer::compare).get();
		System.out.print(num);
		
		System.out.print("\nTotal number of Names : ");
		num = (int) names.stream().count();
		System.out.print(num);
		
		System.out.print("\nName matching with 'Diana' : ");
		boolean isMatched = names.stream().anyMatch(n -> n.equals("Diana"));
		System.out.print(isMatched);
		
		System.out.print("\nName matching with noneMatch() 'John' : ");
		isMatched = names.stream().noneMatch(n -> n.equals("John"));
		System.out.print(isMatched);
		
		System.out.print("\nFinding the first name starts with 'S' : ");
		String name = names.stream().filter(n -> n.startsWith("S")).findFirst().get();
		System.out.print(name);
		
		System.out.print("\nFinding any name starts with 'S' : ");
		name = names.stream().filter(n -> n.startsWith("S")).findAny().get();
		System.out.print(name);
	}

}
