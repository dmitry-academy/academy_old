package by.academy.lesson7.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleExample {
	public static void main(String[] args) {

		String text = "This is the text to be searched for occurrences of the http:// pattern.";
		Pattern pattern = Pattern.compile(".*http://.*");

		Matcher matcher = pattern.matcher(text);
		boolean matches = matcher.matches();
		System.out.println(matches);
	}
}
