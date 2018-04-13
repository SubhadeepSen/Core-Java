package applicationOnCollection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import bean.Student;

public class ApplicationOnCollection {

	public static void main(String[] args) {

		List<Student> students = Arrays.asList(
				new Student("Z", "A", 16), 
				new Student("Y", "C", 27),
				new Student("X", "E", 21), 
				new Student("W", "C", 18), 
				new Student("V", "K", 25)
				);
		
		Collections.sort(students, (s1, s2) -> s1.getFirstName().compareTo(s2.getFirstName()));
		
		students.forEach((s) -> System.out.println(s));
		
		printConditionally(students, (s) -> s.getLastName().startsWith("C"), (s) -> System.out.println(s));
	}
	
	public static void printConditionally(List<Student> students, Predicate<Student> predicate, Consumer<Student> consumer){
		for (Student student : students) {
			if(predicate.test(student))
				consumer.accept(student);
		}
	}
}
