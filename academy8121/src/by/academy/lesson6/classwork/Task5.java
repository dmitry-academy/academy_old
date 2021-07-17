package by.academy.lesson6.classwork;

public class Task5 {

//	5. Дана строка:
//		" Hey      There!     How      Are you doing"   ;
//		оставить лишь 1 пробел между слов.
	public static void main(String... strings) {
		String str = " Hey      There!     How      Are you doing?           ";
		System.out.println(str.replaceAll("\\s+", " ").trim());
	}
}
