package by.academy.lesson8.wildcards;

public class TestBox {
	public void printInt(NumberBox<? extends Integer> value) {
		System.out.println(value);
	}

	public void printDouble(NumberBox<? super Number> value) {
		System.out.println(value);
	}
}
