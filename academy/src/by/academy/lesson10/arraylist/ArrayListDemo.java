package by.academy.lesson10.arraylist;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String... args) {
		ArrayList<Integer> test = new ArrayList<Integer>();
		
		test.add(2);
		test.add(3);
		test.add(1);

		test.remove(1);
		System.out.println(test);
	}
}
