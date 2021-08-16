package by.academy.lesson9;

public class Main {

	public static void main(String[] args) {
		// static nested object
		OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();

		// inner object
		OuterClass outerObject = new OuterClass();
		OuterClass.InnerClass innerObject = outerObject.new InnerClass();

	}

}
