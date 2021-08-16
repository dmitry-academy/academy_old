package by.academy.lesson12;

import java.text.NumberFormat;
import java.text.ParseException;

import by.academy.lesson14.exceptions.custom.CustomException;

public class ExceptionDemo4 {

	public static void main(String[] args) throws CustomException {

		subMethod("sss");
		System.out.println("Конец программы.");
	}

	public static void subMethod(String str) throws CustomException {
		try {
			parseNumber("sss");
		} catch (ParseException e) {
			System.out.println(e.getMessage());
			throw new CustomException();
		}
	}

	public static void parseNumber(String str) throws ParseException {
		NumberFormat nf = NumberFormat.getInstance();
		System.out.println(nf.parse(str));
	}
}