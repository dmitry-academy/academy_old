package by.academy.lesson7.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LookingAtExample {
	public static void main(String[] args) {

		String text = "This is the text to be searched for occurrences of the http:// pattern.";

		Pattern pattern = Pattern.compile("This is the", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(text);

		System.out.println("lookingAt = " + matcher.lookingAt());
		System.out.println("matches   = " + matcher.matches());
	}
}
