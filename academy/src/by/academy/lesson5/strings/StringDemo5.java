package by.academy.lesson5.strings;

//Сравнение подстрок
//В классе String реализована группа методов, сравнивающих часть строки с подстрокой:
//Метод regionMatches() используется для сравнения подстроки в исходной строке с подстрокой в строке-параметре.
//Метод startsWith() проверяет, начинается ли данная подстрока фрагментом, переданным методу в качестве параметра.
//Метод endsWith() проверяет совпадает ли с параметром конец строки.
//Метод contains() проверяет входит ли подстрока в строку.

public class StringDemo5 {
	public static void main(String[] args) {
		System.out.println("Foobar".endsWith("bar"));
		System.out.println("Foobar".startsWith("Foo"));
		System.out.println("Foobar".contains("oo"));
		System.out.println("Hello world!!!".regionMatches(6, "world", 0, 3));
	}
}