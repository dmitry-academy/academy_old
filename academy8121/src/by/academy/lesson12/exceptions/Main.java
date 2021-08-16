package by.academy.lesson12.exceptions;

import by.academy.lesson12.exceptions.custom.CustomException;

class Main {
	public static void main(String[] args) {
		System.out.println(test1(2, 1));
	}

	private static String test1(int a, int b) {
//		try {
//			return test2(a, b);
//		} catch (CustomException | ArrayIndexOutOfBoundsException e) {
//			return "catch";
//		} finally {
		return "still alive";
//		}
	}

	private static String test2(int a, int b) throws Exception, CustomException {
		if (a > b) {
			throw new CustomException("test");
		} else {
			throw new Exception("test");
		}
	}
}