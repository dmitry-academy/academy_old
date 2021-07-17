package by.academy.lesson6.classwork;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo2 {

	public static void main(String[] args) {
		String text = "абв abc    123        _-+!      -+=     13 ёёё ййй ьъ";
		String[] arr = text.split("[\\s]+");

		System.out.println(Arrays.toString(arr));

		String template = "[\\W]+";

		Pattern pattern = Pattern.compile(template);
		Matcher matcher = pattern.matcher(text);

		while (matcher.find()) {
			System.out.println("start index: " + matcher.start());
			System.out.println("end index: " + matcher.end());
			System.out.println(text.substring(matcher.start(), matcher.end()));
			System.out.println("--------------------");
		}
	}

}
