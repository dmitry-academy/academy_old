package by.academy.lesson11;

import java.text.NumberFormat;
import java.text.ParseException;

import by.academy.lesson8.generics.box.Box;

public class ExceptionDemo4 {
	public static void main(String[] args) {
		try {
			parseNumber("sss");
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Конец программы.");

		Box<String> b = null;
		test(b);
	}

	private static void test(Box<String> b) {
		try {
			b.getClass();
		} catch (Exception e) {
			System.err.println("AGAAAA");
			throw new RuntimeException("asdasd");
		}
	}

	public static void parseNumber(String str) throws ParseException {

		NumberFormat nf = NumberFormat.getInstance();
		System.out.println(nf.parse(str));
	}
}