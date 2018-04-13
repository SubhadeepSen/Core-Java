package constructorMethodReference;

public class Student {

	private String firstName;
	private String lastName;

	public Student() {
	}

	public Student(String firstName) {
		this.firstName = firstName;
	}

	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "[FirstName:" + firstName + ", LastName:" + lastName + "]";
	}
}
