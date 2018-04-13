package main;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import bean.Student;

public class WithOutLambdaExpressionOnCollection {

	public static void main(String[] args) {

		List<Student> students = Arrays.asList(
					new Student("Z", "A", 16),
					new Student("Y", "C", 27),
					new Student("X", "E", 21),
					new Student("W", "C", 18),
					new Student("V", "K", 25)
				); 
		
		// Sort the students by their firstName
		Collections.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				return s1.getFirstName().compareTo(s2.getFirstName());
			}
		});
		
		//Print the student list
		for (Student student : students) {
			System.out.println(student);
		}
		
		//Find the students whose lastName starts with C
		for (Student student : students) {
			if (student.getLastName().startsWith("C")) {
				System.out.println(student);
			}
		}
		
	}

}
