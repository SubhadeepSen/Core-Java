package consumerExample;

import java.util.function.Consumer;

/*Consumer<T> is a generic functional interface having functional method as void accpet(T t)
It can be used where the return type is void*/

public class ConsumerExample {

	public static void main(String[] args) {
		Consumer<String> consumer = (s) -> System.out.println(s);
		consumer.accept("Albert Einstein");
	}

}
