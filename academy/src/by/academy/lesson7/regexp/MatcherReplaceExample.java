package by.academy.lesson7.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherReplaceExample {

	public static void main(String[] args) {

		String text = "John writes about this, and John Doe writes about that,"
				+ " and John Wayne writes about everything.";

		String patternString1 = "((John) (.+?)) ";

		Pattern pattern = Pattern.compile(patternString1);
		Matcher matcher = pattern.matcher(text);

		String replaceAll = matcher.replaceAll("Joe Blocks ");
		System.out.println("replaceAll   = " + replaceAll);

		String replaceFirst = matcher.replaceFirst("Joe Blocks ");
		System.out.println("replaceFirst = " + replaceFirst);
	}
}