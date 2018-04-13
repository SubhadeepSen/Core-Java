package streamApiExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import bean.Student;

/*Stream API used to perform bulk operations on Collection.
It enables parallel programming
Till Java 7, there was no concept of parallel programming and it used to use a single core of the process even if 
the processor has multiple cores. It uses all the cores of processor in parallel to improve over all performance.*/

/*Parallel streams divide the provided task into many and run them in different threads, utilizing multiple cores of the 
computer. On the other hand sequential streams work just like for-loop using a single core.

The tasks provided to the streams are typically the iterative operations performed on the elements of a collection 
or array or from other dynamic sources. Parallel execution of streams run multiple iterations simultaniously in 
different available cores.*/

public class StreamAPIExample {

	public static void main(String[] args) {
		List<Student> students = Arrays.asList(
				new Student("Z", "A", 16), 
				new Student("Y", "C", 27),
				new Student("X", "E", 21), 
				new Student("W", "C", 18), 
				new Student("V", "K", 25)
				);
		
		//BULK Operations
		Stream<Student> studentStream = students.stream();
		studentStream.sorted((s1, s2) -> s1.getLastName().compareTo(s2.getLastName()))
					  .filter((s) -> s.getAge() > 20)
					  .filter((s) -> s.getLastName().startsWith("C"))
					 .forEach((s) -> System.out.println(s));
		
		//Parallel Processing
		Stream<Student> studentParallelStream = students.parallelStream();
		studentParallelStream.sorted((s1, s2) -> s1.getLastName().compareTo(s2.getLastName()))
					  .filter((s) -> s.getAge() > 20)
					  .filter((s) -> s.getLastName().startsWith("E"))
					 .forEach((s) -> System.out.println(s));
		
	}

}
