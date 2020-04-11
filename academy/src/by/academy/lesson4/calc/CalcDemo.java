package by.academy.lesson4.calc;

import by.academy.lesson4.calc.impl.MarketCalc;

public class CalcDemo {
	public static void main(String... args) {
		
		MarketCalc calc = new MarketCalc();
		
		System.out.println(calc.getPrice(5));
		calc.calc23();
	}
}
