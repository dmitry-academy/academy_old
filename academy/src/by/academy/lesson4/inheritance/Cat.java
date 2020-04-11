package by.academy.lesson4.inheritance;

import java.util.ArrayList;
import java.util.List;

import by.academy.lesson4.finals.Animal;

public class Cat extends Animal {

	public int numberOfLaps = 3;
	public List<String> list = new ArrayList<String>();

	{
		list.add("Hello");
		list.add("World");
	}
}
