package by.academy.lesson5.stringappender;

public class StringBuilderEquals {
	public static void main(String[] args) {
		StringBuilder stringBuilder1 = new StringBuilder("Hello");
		StringBuilder stringBuilder2 = new StringBuilder("Hello");

		System.out.println(stringBuilder1.equals(stringBuilder2));
		System.out.println(stringBuilder1 == stringBuilder2);

		System.out.println(stringBuilder1.toString().equals(stringBuilder2.toString()));
	}
}