package by.academy.lesson11.classwork;

import java.util.Set;
import java.util.TreeSet;

import by.academy.lesson7.oop.HeavyBox;

public class Task2 {
	public static void main(String... args) {
		Set<HeavyBox> set = new TreeSet<>();

		HeavyBox hbox1 = new HeavyBox(1, 2, 3, 4);
		HeavyBox hbox2 = new HeavyBox(2, 3, 4, 4);
		HeavyBox hbox3 = new HeavyBox(3, 4, 5, 4);
		HeavyBox hbox4 = new HeavyBox(4, 5, 6, 4);

		set.add(hbox1);
		set.add(hbox2);
		set.add(hbox3);
		set.add(hbox4);

		for (HeavyBox b : set) {
			System.out.println(b);
		}
		
	}
}
