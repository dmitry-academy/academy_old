package by.academy.lesson4.calc.impl;

public class MarketCalc extends EconomicCalc {

	public double getPrice(int numberOfGoods) {
		double price = caclDiscount(numberOfGoods);
		calc23();
		return price;
	}
}
