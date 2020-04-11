package by.academy.lesson4.calc.impl.sub1;

import by.academy.lesson4.calc.impl.EconomicCalc;

public class MarketCalc extends EconomicCalc {

	public double getPrice(int numberOfGoods) {
		double price = caclDiscount(numberOfGoods);
		return price;
	}
}
