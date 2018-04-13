package supplierExample;

import java.util.function.Supplier;

/*Supplier<T> is a generic functional interface having functional method as T get()
It can be used where something is returned by the function*/

public class SupplierExample {

	public static void main(String[] args) {

		Supplier<String> supplier1 = () -> "Hello";
		System.out.println(supplier1.get());
		
		Supplier<String> supplier2 = () -> new String("Albert Einstein");
		System.out.println(supplier2.get());
		
		Supplier<Integer> supplier3 = () -> 75;
		System.out.println(supplier3.get());
	}

}
