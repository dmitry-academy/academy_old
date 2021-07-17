package by.academy.lesson5.classwork;

import java.util.Scanner;

public class Task1_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number of strings: ");
		int numberOfStrings = scan.nextInt();
		scan.nextLine();
		String min = null;
		String max = null;
		for (int i = 0; i < numberOfStrings; i++) {
			System.out.println("Enter string: ");
			String str = scan.next();

			if (min == null) {
				min = str;
			}

			if (max == null) {
				max = str;
			}

			if (str.length() > max.length()) {
				max = str;
			}

			if (str.length() < min.length()) {
				min = str;
			}
		}
		
		System.out.println("Min: " + min);
		System.out.println("Min length: " + min.length());

		System.out.println("Max: " + max);
		System.out.println("Min length: " + max.length());

		scan.close();
	}

}
