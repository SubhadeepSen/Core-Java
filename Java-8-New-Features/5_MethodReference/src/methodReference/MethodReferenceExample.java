package methodReference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

import instanceMethodReferenceForParticularType.Student;

public class MethodReferenceExample {

	public static void main(String[] args) {
		
		List<Student> students = Arrays.asList(
				new Student("Z", "A", 16), 
				new Student("Y", "C", 27),
				new Student("X", "E", 21), 
				new Student("W", "C", 18), 
				new Student("V", "K", 25)
				);
		
		//Lambda Expression
		System.out.println("----------LAMBDA EXPRESSION----------");
		//Lambda Expression for calling Constructor
		Supplier<MethodContainer> invokeConstructorLambdaExp = () -> new MethodContainer();
		MethodContainer labmdaObj = invokeConstructorLambdaExp.get();
		
		//Lambda Expression for calling Instance Method on a particular Object
		Consumer<String> invokeInstanceMethodSetLambdaExp = (n) -> labmdaObj.setName(n);
		invokeInstanceMethodSetLambdaExp.accept("John");
		Supplier<String> invokeInstanceMethodGetLambdaExp = () -> labmdaObj.getName();
		System.out.println(invokeInstanceMethodGetLambdaExp.get());
		
		//Lambda Expression for calling Static Method
		Supplier<String> invokeStaticMethodLambdaExp = () -> MethodContainer.getCity();
		System.out.println(invokeStaticMethodLambdaExp.get());
		
		//Lambda Expression for calling Instance Method on an arbitrary Object of Particular Type
		students.forEach((s) -> System.out.println(s));
		
		
		//Equivalent Method Reference
		System.out.println("\n----------METHDO REFERENCE----------");
		//Reference to a Constructor 
		Supplier<MethodContainer> invokeConstructorMethodRef = MethodContainer::new;
		MethodContainer methodRefObj = invokeConstructorMethodRef.get();
		
		//Reference to an Instance Method of a particular object
		Consumer<String> invokeInstanceMethodSetMethodRef = methodRefObj::setName;
		invokeInstanceMethodSetMethodRef.accept("John");
		Supplier<String> invokeInstanceMethodGetMethodRef = methodRefObj::getName;
		System.out.println(invokeInstanceMethodGetMethodRef.get());
		
		//Reference to a Static Method
		Supplier<String> invokeStaticMethodMethodRef = MethodContainer::getCity;
		System.out.println(invokeStaticMethodMethodRef.get());
		
		//Reference to an Instance Method of an arbitrary object of a particular type
		students.forEach(System.out::println);
	}
}
