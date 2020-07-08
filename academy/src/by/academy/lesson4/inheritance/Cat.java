package by.academy.lesson4.inheritance;

import java.util.ArrayList;
import java.util.List;

import by.academy.lesson4.finals.Animal;

public class Cat extends Animal {

	public int numberOfLaps = 3;
	public static List<String> list = new ArrayList<String>();
	static {
		list.add("Hello");
		list.add("World");
	}

	
	public void t() {
		
	}
	public static void test() {
		
		System.out.println("our list: ");

		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("----------");
	}

}
