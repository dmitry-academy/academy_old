package by.academy.lesson5;

public class Test {
	public static void main(String[] args) {

		int i = 0;
		int p = (int) Math.pow(2, i);
		while (p <= 1000000) {
			System.out.println("2^" + i + "=" + p);
			i++;
			p = (int) Math.pow(2, i);
		}
	}
}
