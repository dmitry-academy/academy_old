package by.academy.lesson6.regexp;

import java.util.Arrays;
import java.util.regex.Pattern;

public class RegexDemo6 {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("\\d+\\s?");
		String[] words = pattern.split("java5tiger 77 java6mustang");
		System.out.print(Arrays.toString(words));
	}
}
