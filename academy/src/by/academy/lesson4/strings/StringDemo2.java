package by.academy.lesson4.strings;

import java.util.Arrays;

public class StringDemo2 {
	public static void main(String... args) {

		// concat(): объединяет строки
		String s1 = "IT";
		String s2 = "Academy";
		System.out.println("concat(): объединяет строки");
		System.out.println(s1.concat(s2));
		System.out.println("---------------------------");

		// valueOf(): преобразует объект в строковый вид
		Long l1 = 2000l;
		Integer i1 = 100;
		System.out.println("valueOf(): преобразует объект в строковый вид");
		System.out.println(String.valueOf(l1));
		System.out.println(String.valueOf(i1));
		System.out.println("---------------------------");

		// join(): соединяет строки с учетом разделителя
		System.out.println("join(): соединяет строки с учетом разделителя");
		System.out.println(String.join("-", s1, s2, s2));
		System.out.println("---------------------------");

		// charAt(): возвращает символ строки по индексу
		System.out.println("charAt(): возвращает символ строки по индексу");
		System.out.println(s1.charAt(1));
		System.out.println("---------------------------");

		// getChars(): возвращает группу символов
		System.out.println("getChars(): возвращает группу символов");
		char[] cArray = new char[100];
		s2.getChars(1, s2.length() - 1, cArray, 0);
		System.out.println(Arrays.toString(cArray));
		System.out.println("---------------------------");

		// equals(): сравнивает строки с учетом регистра
		System.out.println("IT".equals("Academy"));
		System.out.println("Academy".equals("Academy"));

		// equalsIgnoreCase(): сравнивает строки без учета регистра
		System.out.println("AcAdeMy".equals("academy"));

		// regionMatches(): сравнивает подстроки в строках
		System.out.println("Hello, How are you".regionMatches(7, "How", 0, 3));

		// indexOf(): находит индекс первого вхождения подстроки в строку
		System.out.println("Hello, How are you".indexOf("How"));

		// lastIndexOf(): находит индекс последнего вхождения подстроки в строку
		System.out.println("Hello, How are you".indexOf("o"));

		// startsWith(): определяет, начинается ли строка с подстроки
		System.out.println("Hello, How are you".startsWith("Hell"));
		System.out.println("Hello, How are you".startsWith("a"));

		// endsWith(): определяет, заканчивается ли строка на определенную подстроку
		System.out.println("Hello, How are you".startsWith("u"));
		System.out.println("Hello, How are you".startsWith("are"));

		// replace(): заменяет в строке одну подстроку на другую
		System.out.println("Hello, How are you".replace("you", "you doing?"));

		// trim(): удаляет начальные и конечные пробелы
		System.out.println("   Hello, How are you ".trim());

		// substring(): возвращает подстроку, начиная с определенного индекса до конца
		// или до определенного индекса
		System.out.println("Hello, How are you".substring(10, 15));

		// toLowerCase(): переводит все символы строки в нижний регистр
		System.out.println("Hello, How are you".toLowerCase());

		// toUpperCase(): переводит все символы строки в верхний регистр
		System.out.println("Hello, How are you".toUpperCase());

		// Academy
		System.out.println("---------------------------");
		System.out.println("---------------------------");
		System.out.println("---------------------------");
		"Academy".getChars(1, 5, cArray, 0);
		System.out.println("Academy".substring(1, 5));
		System.out.println(Arrays.toString(cArray));
	}
}
