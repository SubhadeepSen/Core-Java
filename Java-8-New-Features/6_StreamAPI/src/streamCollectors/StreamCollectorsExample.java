package streamCollectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectorsExample {

	public static void main(String[] args) {
		List<String> letters = Arrays.asList("A", "B", "C", "D", "E");
		List<String> names = Arrays.asList("Sunny", "Subha", "Deep", "Subhadeep", "Diana");
		
		//Java 7 approach for concatenating
		String concat1 = "";
		for (String l : letters) {
			concat1 += l;
		}
		System.out.println("Java 7 concatenated list: " + concat1);
		
		//Java 8 approach for concatenating using Stream API
		//String concat2 = letters.stream().collect(Collectors.joining());
		String concat2 = letters.stream().collect(Collectors.joining("-"));	//Adds delimiter in between two list objects
		System.out.println("Java 8 concatenated list: " + concat2);
		
		//Java 7 approach for retrieving the names whose name starts with D
		List<String> nameList1 = new ArrayList<>();
		for (String name : names) {
			if(name.startsWith("D"))
				nameList1.add(name);
		}
		System.out.println("Java 7 name list: " + nameList1);
		
		//Java 8 approach for retrieving the names whose name starts with D using Stream API
		List<String> nameList2 = names.stream().filter(n->n.startsWith("D")).collect(Collectors.toList());
		System.out.println("Java 8 name list: " + nameList2);
	}

}
