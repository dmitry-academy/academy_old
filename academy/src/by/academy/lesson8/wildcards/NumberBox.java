package by.academy.lesson8.wildcards;

class NumberBox<T extends Number> {
	T obj;

	public T getObj() {
		return obj;
	}

	public void print(NumberBox<?> value) {
		System.out.println(value);
	}

	public void printInt(NumberBox<? extends Integer> value) {
		System.out.println(value);
	}

	public void printDouble(NumberBox<? super Number> value) {
		System.out.println(value);
	}
}
