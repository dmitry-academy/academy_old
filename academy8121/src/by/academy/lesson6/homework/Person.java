package by.academy.lesson6.homework;

import java.util.Scanner;

public class Person {
	private int age;
	private String name;

	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public void doSmth() {
		int counter = 0;
		while (true) {
			if (counter > 100000) {
				break;
			}
			counter++;
		}
		int i = 1;
		if (1 < 2) {
			i++;
			i++;
		}
		float f = Float.parseFloat("1.1");
		if (f > 0) {
			System.out.println(f + f);
		}

		String c = "";
		switch (c) {
		case ("vase"):
			;
			break;
		}

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
