package by.academy.lesson12.classwork;

import by.academy.lesson12.exceptions.custom.CustomException;
import by.academy.lesson12.exceptions.custom.CustomException1;
import by.academy.lesson12.exceptions.custom.CustomException2;
import by.academy.lesson12.exceptions.custom.CustomException3;
import by.academy.lesson12.exceptions.custom.CustomNotInheritedException;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		System.out.println(subRoutine(12312312));
	}

	public static int subRoutine(int i) {
		try {
			subRoutine1(12312312);
			return 1;
		} catch (CustomException | CustomNotInheritedException e) {
			System.out.println("error 3");
			e.fillInStackTrace();

		} finally {
			return 3;
		}
	}

	public static void subRoutine1(int i) throws CustomException, CustomNotInheritedException {

		if (i == 1) {
			throw new CustomException();
		} else if (i == 2) {
			throw new CustomException1();
		} else if (i == 3) {
			throw new CustomException2();
		} else if (i == 4) {
			throw new CustomException3();
		} else {
			throw new CustomNotInheritedException();
		}
	}

}
