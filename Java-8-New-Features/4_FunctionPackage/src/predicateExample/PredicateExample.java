package predicateExample;

import java.util.function.Predicate;

/*Predicate<T> is a generic functional interface having functional method as boolean test(T t)
It can be used where the return type is a boolean value*/

public class PredicateExample {

	public static void main(String[] args) {
		Predicate<String> predicate = (s) -> s.contains("ll");
		System.out.println(predicate.test("Hello"));
		
		predicate = (s) -> s.equals("Hello");
		System.out.println(predicate.test("Bye"));
	}

}
