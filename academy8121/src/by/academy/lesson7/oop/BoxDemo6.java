package by.academy.lesson7.oop;

public class BoxDemo6 {
	public static void main(String[] args) {
		Box b1 = new Box();
//		Box b2 = b1;
		Box b2 = new Box();

		b1.width = 10;
		b1.height = 20;
		b1.depth = 15;

		b2.width = 10;
		b2.height = 20;
		b2.depth = 15;

		System.out.println(b1);
		System.out.println(b2);

		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2));

	}
}