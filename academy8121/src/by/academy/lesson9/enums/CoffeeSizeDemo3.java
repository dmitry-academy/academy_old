package by.academy.lesson9.enums;

import by.academy.lesson9.enums.Coffee3.CoffeeSize;

public class CoffeeSizeDemo3 {
	public static void main(String[] args) {

		CoffeeSize coffeeSize = CoffeeSize.valueOf("OVERWHELMING");
		
		System.out.println(CoffeeSize.OVERWHELMING == coffeeSize);
		System.out.println("Переменная coffeeSize содержит " + coffeeSize);
		
		System.out.println(coffeeSize.ordinal());
	}
}