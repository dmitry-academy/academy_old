package by.academy.lesson7.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestsDemo {
	public static void main(String... args) {
		System.out.println("First part: ");
		System.out.println(test1("BACON")); // true
		System.out.println(test1("  BACON")); // false
		System.out.println(test1("BACON  ")); // false
		System.out.println(test1("^BACON$")); // false
		System.out.println(test1("bacon")); // false

		System.out.println();
		System.out.println("Second part: ");
		System.out.println(test2("trololo.com")); // true
		System.out.println(test2("trololo.ua ")); // false
		System.out.println(test2("trololo.ua")); // true
		System.out.println(test2("trololo/ua")); // false
		System.out.println(test2("I love java potomyshto eto cool.ru")); // true
		System.out.println(test2("BACON.ru")); // true
		System.out.println(test2("BACON.de")); // false
	}

	public static boolean test1(String testString) {
		Pattern p = Pattern.compile("^BACON$");
		Matcher m = p.matcher(testString);
		return m.matches();
	}

	public static boolean test2(String testString) {
		Pattern p = Pattern.compile(".+\\.(com|ua|ru)");
		Matcher m = p.matcher(testString);
		return m.matches();
	}
}
