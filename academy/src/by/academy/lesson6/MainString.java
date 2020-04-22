package by.academy.lesson6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainString {
	public static void main(String... args) {

		Pattern p = Pattern.compile("\\Gst");
		Matcher matcher = p.matcher("estst3 - st ring - test ");

		while (matcher.find()) {
			System.out.println("st found!!!");
			System.out.println("start position: " + matcher.start());
			System.out.println("end position: " + matcher.end());
		}
	}
}
