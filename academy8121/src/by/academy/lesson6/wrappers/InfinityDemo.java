package by.academy.lesson6.wrappers;

public class InfinityDemo {
	public static void main(String[] args) {
		int a = 7;
		double b = 0.0;
		double c = -0.0;
		double g = Double.NEGATIVE_INFINITY;
		
		Double dMax = Double.MAX_VALUE;
		Double dMin = Double.MIN_VALUE;

		System.out.println("7 / 0.0 = " + a / b);
		System.out.println("7 / -0.0 = " + a / c);
		System.out.println("0.0 == -0.0 = " + (b == c));
		System.out.println("-Infinity * 0 = " + g * 0);
	}
}