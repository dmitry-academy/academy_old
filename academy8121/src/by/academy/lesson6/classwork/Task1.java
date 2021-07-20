package by.academy.lesson6.classwork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//1. Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
//общее их количество
//2. Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
//учесть, что слова могут разделяться несколькими пробелами, в начале и конце
//текста также могут быть пробелы, но могут и отсутствовать.
public class Task1 {

	public static void main(String[] args) {
		String text = "2. Имеется строка с текстом! Подсчитать количество слов в тексте. Желательно "
				+ "учесть, что слова могут разделяться несколькими пробелами, в начале и конце "
				+ "текста также могут быть пробелы, но могут и отсутствовать?";
		String regex = "[\\.,!?;-]";

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(text);

		int counter = 0;
		while (m.find()) {
			counter++;
			System.out.print(text.substring(m.start(), m.end()));
		}
		System.out.println();
		System.out.println(counter);
	}

}
