package constructorMethodReference;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorMethodReference {

	public static void main(String[] args) {

		//Using Lambda Expression
		//Invoking No-Arg Constructor
		Supplier<Student> stdSupLam1 = () -> new Student();
		System.out.println(stdSupLam1.get());
		
		//Invoking One-Arg Constructor
		Function<String, Student> stdSupLam2 = (f) -> new Student(f);
		System.out.println(stdSupLam2.apply("Albert"));
		
		//Invoking Two-Arg Constructor
		BiFunction<String, String, Student> stdSupLam3 = (f, l) -> new Student(f, l);
		System.out.println(stdSupLam3.apply("Albert", "Einstein"));
		
		//Reference to a Constructor : Replacement of the above Lambda Expression
		//ClassName :: new
		
		////Invoking No-Arg Constructor
		Supplier<Student> stdSupMethRef1 = Student::new;
		System.out.println(stdSupMethRef1.get());
		
		//Invoking One-Arg Constructor
		Function<String, Student> stdSupMethRef2 = Student::new;
		System.out.println(stdSupMethRef2.apply("Albert"));
		
		//Invoking Two-Arg Constructor
		BiFunction<String, String, Student> stdSupMethRef3 = Student::new;
		System.out.println(stdSupMethRef3.apply("Albert", "Einstein"));
		
	}

}
