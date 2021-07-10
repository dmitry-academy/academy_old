package by.academy.lesson3.scanner;

import java.util.Scanner;

public class ScannerDemo5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int i1 = scan.nextInt();
		int i2 = scan.nextInt();
		String str1 = scan.nextLine();


		System.out.println(str);
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(str1);

		scan.close();
	}

}
