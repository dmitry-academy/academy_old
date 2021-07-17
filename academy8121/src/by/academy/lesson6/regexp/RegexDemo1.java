package by.academy.lesson6.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 {
	public static void main(String[] args) {

//		String stringPattern = "c[a|o|u](de)+[S]*";
		String stringPattern = "(de){1,2}";

		String text = "codededede 777 cade cudeSS";

		Pattern pattern = Pattern.compile(stringPattern);
		Matcher matcher = pattern.matcher(text);
		while (matcher.find()) {
			System.out.println("FIND!");
			System.out.println("start index: " + matcher.start());
			System.out.println("end index: " + matcher.end());
			System.out.println(text.substring(matcher.start(), matcher.end()));
			System.out.println("--------------------");
		}
	}
}