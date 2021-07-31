package by.academy.lesson9.enums;

import by.academy.lesson9.enums.Coffee3.CoffeeSize;

public class CoffeeSizeCompareTo {
	public static void main(String[] args) {
		CoffeeSize bigCup = CoffeeSize.BIG;
		CoffeeSize hugeCup = CoffeeSize.HUGE;
		CoffeeSize anotherBigCup = CoffeeSize.BIG;
		CoffeeSize overwhelmingCup = CoffeeSize.OVERWHELMING;

		System.out.println("bigCup.compareTo(hugeCup): " + bigCup.compareTo(hugeCup));
		System.out.println("hugeCup.compareTo(bigCup): " + hugeCup.compareTo(bigCup));
		System.out.println("bigCup.compareTo(anotherBigCup): " + bigCup.compareTo(anotherBigCup));
		System.out.println("bigCup.compareTo(overwhelmingCup): " + bigCup.compareTo(overwhelmingCup));
	}
}