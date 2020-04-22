package by.academy.lesson7.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegExp {

	public static void main(String[] args) {
//		System.out.println("-20934".matches("-?[0-9]+"));
//		System.out.println("-203d34".matches("-?[0-9]+"));

//		String str = "Test    string    for split";
//		String[] words = str.split(" +");
//		for (String word : words) {
//			System.out.println(word + " ");
//		}
//
//		String str1 = "Test     multiple            spaces";
//		System.out.println(str1.replaceAll(" +", " "));
//		Pattern p = Pattern.compile("\\b[abc]+\\S*");
//		Matcher m = p.matcher("aaa - bcccwec - dccc");
//		while (m.find()) {
//			System.out.println(m.start());
//			System.out.println(m.end());
//			System.out.println(m.group(0));
//		}

		Pattern pattern = Pattern.compile("www\\.(\\w+)\\.by");
		Matcher matcher = pattern.matcher("   www.tut.by    ");
		matcher.find();
		System.out.println(matcher.group(0));
		System.out.println(matcher.group(1));
		System.out.println(matcher.group(2));
	}

}
