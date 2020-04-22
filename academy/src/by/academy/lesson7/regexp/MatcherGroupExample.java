package by.academy.lesson7.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherGroupExample {

	public static void main(String[] args) {

		String text = "John writes about this, and John writes about that," + " and John writes about everything. ";

		Pattern pattern = Pattern.compile("(John)");
		Matcher matcher = pattern.matcher(text);

		while (matcher.find()) {
			System.out.println("found: " + matcher.group(1));
		}
	}
}