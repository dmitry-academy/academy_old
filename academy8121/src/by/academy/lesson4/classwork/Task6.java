package by.academy.lesson4.classwork;

import java.math.BigDecimal;

public class Task6 {

	public static void main(String[] args) {
		double summ = 1000;
		int percent = 3;
		int years = 5;

		for (int i = 0; i < years; i++) {
			summ += (summ * percent * 0.01);
		}
		System.out.println(summ);
	}

}
