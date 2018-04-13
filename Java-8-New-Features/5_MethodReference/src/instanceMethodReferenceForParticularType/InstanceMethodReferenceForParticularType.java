package instanceMethodReferenceForParticularType;

import java.util.Arrays;
import java.util.List;

public class InstanceMethodReferenceForParticularType {

	public static void main(String[] args) {
		
		List<Student> students = Arrays.asList(
				new Student("Z", "A", 16), 
				new Student("Y", "C", 27),
				new Student("X", "E", 21), 
				new Student("W", "C", 18), 
				new Student("V", "K", 25)
				);

		//Using Lambda Expression
		students.forEach((s) -> System.out.println(s));
		
		//Reference to an Instance Method of an arbitrary object of a particular type : Replacement of the above Lambda Expression
		//Object :: InstanceMethodName
		System.out.println();
		students.forEach(System.out::println);
	}
}
