package by.academy.lesson7.oop;

public class BadRecursion {

	static void recursion(int counter, int n) {
		counter++;
		System.out.println("Counter: " + counter);
		if (counter > 100) {
			return;
		}
		recursion(counter, n);
	}

	public static void main(String[] args) {
		int i = 0;
		recursion(i, 5);
	}
}