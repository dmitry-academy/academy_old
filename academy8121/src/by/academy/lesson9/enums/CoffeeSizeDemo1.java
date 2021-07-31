package by.academy.lesson9.enums;

import by.academy.lesson9.enums.Coffee3.CoffeeSize;

public class CoffeeSizeDemo1 {
	public static void main(String[] args) {

		CoffeeSize coffeeSize = CoffeeSize.HUGE;

		if (coffeeSize == CoffeeSize.BIG) {
			System.out.println(coffeeSize);
		} else {
			System.out.println("НЕ БИГ");
		}

		CoffeeSize coffeeSize1 = CoffeeSize.valueOf("SMALL");
		System.out.println(coffeeSize1);
	}
}