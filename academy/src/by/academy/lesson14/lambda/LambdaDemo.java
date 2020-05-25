package by.academy.lesson14.lambda;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class LambdaDemo {
	public static void main(String... args) {

		Supplier<Integer> supplier = () -> {
			return new Random().nextInt(255);
		};

		Predicate<Integer> predicate = (intValue) -> intValue < 50;

		Function<Integer, Character> function = intValue -> (char) intValue.intValue();
		// Синтаксис использования Method References
		Consumer<Character> consumer = System.out::print;

		long count = Stream.generate(supplier).limit(100).filter(predicate).map(function)
//				.peek(consumer)
				.count();

		System.out.println();
		System.out.println(count);

	}

}
