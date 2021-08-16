package by.academy.lesson5.matchergroups;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 6. Регулярное выражение для проверки email

public class RegexDemoEmail {
	public static void main(String... args) {
		String regex = "(\\w{6,})@(\\w+\\.)([a-z]{2,4})";
		String s = "адреса эл.почты:ivanov@gmail.com, sidorov@bsu.by!";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(s);
		while (matcher.find()) {
			System.out.println("e-mail: " + matcher.group());
		}
	}
}
