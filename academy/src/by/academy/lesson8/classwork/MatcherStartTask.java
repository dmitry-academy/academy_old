package by.academy.lesson8.classwork;

import java.util.Scanner;

public class MatcherStartTask {
	public static void main(String... args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter IP: ");
		String ip = scan.next();

		System.out.println(checkIP(ip));

		scan.close();

	}

	private static boolean checkIP(String input) {
		return input.matches("((0|1\\d{0,2}|2([0-4][0-9]|5[0-5]))\\.){3}(0|1\\d{0,2}|2([0-4][0-9]|5[0-5]))");
	}
}
