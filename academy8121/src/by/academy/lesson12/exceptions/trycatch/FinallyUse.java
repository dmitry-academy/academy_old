package by.academy.lesson12.exceptions.trycatch;

import java.util.Scanner;

public class FinallyUse {
	// Выход из метода через исключение
	public static void procA() {
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("Внутри procA");
			throw new RuntimeException("demo");
		} 
	}

	// Возврат изнутри try-блока
	public static void procB() {

		try {
			System.out.println("Внутри procB");
			return;
		} finally {
			System.out.println("finally для procB ");
		}
	}

	// Нормальное выполнение try-блока
	public static void procC() {
		try {
			System.out.println("Внутри procC");
		} finally {
			System.out.println("finally procC");
		}
	}

	public static void main(String[] args) {
//		try {
//			procA();
//		} catch (Exception e) {
//			System.out.println("Исключение выброшено");
//		}
//		procB();
		procC();
//		System.out.println("test");
	}
}