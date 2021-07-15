package by.academy.lesson5.strings;

public class StringDemo5 {
	public static void main(String[] args) {

		System.out.println("foobar".equalsIgnoreCase("FOOBAR"));
		System.out.println("foobar".equals("FOOBAR"));

		System.out.println("Foobar".startsWith("Foo"));
		System.out.println("Foobar".startsWith("cat"));

		System.out.println("Foobar".endsWith("bar"));
		System.out.println("Foobar".endsWith("cat"));

		System.out.println("Foobar".contains("oo"));
		System.out.println("Foobar".contains("cat"));

		System.out.println("Hello world!!!".regionMatches(6, "worrr", 0, 4));
		System.out.println("Hello world!!!".regionMatches(7, "world", 0, 4));

	}
}