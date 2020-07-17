package by.academy.lesson5.test;

import java.util.Scanner;

public class MainDemo {
	public static void main(String... args) {

		Scanner sc = new Scanner(System.in);

		int s1 = sc.nextInt();
		sc.nextLine();
		
		String s2 = sc.nextLine();

		System.out.println(s1);
		System.out.println(s2);

		sc.close();
	}
}
