package by.academy.lesson5.strings;

public class StringEmpty {
	public static void main(String[] args) {
		String s = new String("");
		System.out.println("".isEmpty());
		System.out.println(" ".isEmpty());
		System.out.println(" ".isBlank());
		System.out.println("".isBlank());

		System.out.println("  5  ".trim());

		System.out.println("".isEmpty());
	}
}