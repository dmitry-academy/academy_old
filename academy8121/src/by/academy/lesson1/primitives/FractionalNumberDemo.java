package by.academy.lesson1.primitives;

public class FractionalNumberDemo {

	public static void main(String[] args) {

		double d1 = 3.45;
		float f1 = 34.456f;

		int a = 7;
		double b = 0.0;
		double c = -0.0;
		double g = Double.NEGATIVE_INFINITY;

		System.out.println(a / b);
		System.out.println(a / c);
		System.out.println(b == c);
		System.out.println(g * 0);
	}

}
