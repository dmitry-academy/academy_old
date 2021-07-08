package by.academy.lesson3.scanner;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your name: ");
		String name = sc.nextLine();

		// Character input
		System.out.println("Enter your gender:  ");
		char gender = sc.next().charAt(0);

		System.out.println("How old are you? ");
		int age = sc.nextInt();

		System.out.println("Enter your mobile number:  ");
		long mobileNo = sc.nextLong();

		System.out.println("Name: " + name);
		System.out.println("Gender: " + gender);
		System.out.println("Age: " + age);
		System.out.println("Mobile Number: " + mobileNo);
		
		sc.close();
	}
}