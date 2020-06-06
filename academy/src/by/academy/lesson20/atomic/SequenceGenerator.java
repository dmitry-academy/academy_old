package by.academy.lesson20.atomic;

import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicReference;

public class SequenceGenerator {
	private static BigInteger MULTIPLIER;
	private AtomicReference<BigInteger> element;

	public SequenceGenerator() {
		if (MULTIPLIER == null)
			MULTIPLIER = BigInteger.valueOf(2);
		element = new AtomicReference<BigInteger>(BigInteger.ONE);
	}

	public BigInteger next() {
		BigInteger value;
		BigInteger next;
		do {
			value = element.get();
			next = value.multiply(MULTIPLIER);
		} while (!element.compareAndSet(value, next));
		return value;
	}
}