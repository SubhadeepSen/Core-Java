package functionExample;

import java.util.function.Function;

/*Function<T,R> is a generic functional interface having functional method as R apply(T t)
It can be used where the method is taking one parameter and return an object*/

public class FunctionExample {

	public static void main(String[] args) {

		Function<String, Integer> function = (s) -> s.length();
		System.out.println(function.apply("Hello"));
	}

}
