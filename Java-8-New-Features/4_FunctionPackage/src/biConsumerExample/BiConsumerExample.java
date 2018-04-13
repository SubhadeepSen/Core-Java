package biConsumerExample;

import java.util.function.BiConsumer;

/*BiConsumer<T, U> is a generic functional interface having functional method as void accpet(T t, U u)
It can be used where the return type is void*/

public class BiConsumerExample {

	public static void main(String[] args) {
		BiConsumer<String, Integer> biCocnsumer = (s, i) -> System.out.println(s + i);
		biCocnsumer.accept("Hello", 5);
	}

}
