package main;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import bean.Student;

public class LambdaExpressionOnCollection {

	public static void main(String[] args) {

		List<Student> students = Arrays.asList(
				new Student("Z", "A", 16), 
				new Student("Y", "C", 27),
				new Student("X", "E", 21), 
				new Student("W", "C", 18), 
				new Student("V", "K", 25)
				);

		// Sort the students by their firstName
		Collections.sort(students, (s1, s2) -> s1.getFirstName().compareTo(s2.getFirstName()));

		// Print the student list
		/*print(students, (s) -> System.out.println(s));*/
		//students.forEach((s) -> System.out.println(s));
		printConditionally(students, (s) -> true, (s) -> System.out.println(s));
		
		// Find the students whose lastName starts with C
		printConditionally(students, (s) -> s.getLastName().startsWith("C"), (s) -> System.out.println(s));
	}
	
	/*public static void print(List<Student> students, Printer printer){
		for (Student student : students) {
			printer.print(student);
		}
	}*/
	
	public static void printConditionally(List<Student> students, Condition condition, Printer printer){
		for (Student student : students) {
			if (condition.check(student)) {
				//System.out.println(student);
				printer.print(student);
			}
		}
	}

}

interface Printer{
	public void print(Student s);
}

interface Condition{
	public boolean check(Student s);
}
