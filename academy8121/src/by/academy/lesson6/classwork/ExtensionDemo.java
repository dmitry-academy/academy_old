package by.academy.lesson6.classwork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtensionDemo {

	public static void main(String[] args) {
		String text = "Используются файлы file1.doc, file2.txt."
				+ "А еще было бы неплохо обратить внимание на файл file3.img."
				+ "Также просмотрите содержимое file4.doc.  .tes";

		String template = "[a-zA-Z0-9]*\\\\.[a-z]{3}";

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
