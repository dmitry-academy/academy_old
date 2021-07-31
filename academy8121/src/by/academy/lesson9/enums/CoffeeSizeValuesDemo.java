package by.academy.lesson9.enums;

import by.academy.lesson9.enums.Coffee3.CoffeeSize;

public class CoffeeSizeValuesDemo {
	public static void main(String[] args) {

		System.out.println("Константы перечислимого типа CoffeeSize:");
		CoffeeSize[] coffeeSizes = CoffeeSize.values();

		for (CoffeeSize c : coffeeSizes) {
			System.out.println(c);
		}
	}
}