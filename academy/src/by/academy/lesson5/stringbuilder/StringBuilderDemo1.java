package by.academy.lesson5.stringbuilder;

public class StringBuilderDemo1 {
	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder("Hello");

		System.out.println("string = " + stringBuilder);
		System.out.println("length = " + stringBuilder.length());
		System.out.println("capacity = " + stringBuilder.capacity());
	}
}