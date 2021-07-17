package by.academy.lesson6.classwork;

import java.util.regex.Pattern;

public class Task6 {
	static Pattern p = Pattern.compile("\\w+@\\w+\\.\\w+");

	public static void main(String... args) {
		String s = " 123test@_123test._123test ";

		System.out.println(validate(s));
	}

	private static boolean validate(String s) {
		s = s.trim();
		return p.matcher(s).matches();
	}
}
