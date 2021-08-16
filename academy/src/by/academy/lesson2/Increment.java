package by.academy.lesson2;

public class Increment {
	public static void main(String[] args) {
		int x = 1, y, z;
		System.out.println("x=" + x);
		y = ++x; // сначала добавили, потом присвоили
		System.out.println("x=" + x);
		z = x++; // сначала присвоили, потом добавили
		System.out.println("x=" + x);

		System.out.println("y=" + y);
		System.out.println("z=" + z);
		
		
		int test = 1;
		
		System.out.println(test++);
		System.out.println(test);

	}
}
