package by.academy.lesson9.enums;

import by.academy.lesson9.enums.Coffee3.CoffeeSize;

public class CoffeeSizeEquals {
	public static void main(String[] args) {
		CoffeeSize bigCup = CoffeeSize.BIG;
		CoffeeSize hugeCup = CoffeeSize.HUGE;
		CoffeeSize anotherBigCup = CoffeeSize.BIG;

		System.out.println("bigCup.equals(hugeCup): " + bigCup.equals(hugeCup));
		System.out.println("bigCup.equals(anotherBigCup): " + bigCup.equals(anotherBigCup));
		System.out.println("bigCup == anotherBigCup: " + (bigCup == anotherBigCup));
	}
}