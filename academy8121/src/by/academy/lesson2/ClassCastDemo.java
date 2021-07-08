package by.academy.lesson2;

public class ClassCastDemo {
	public static void main(String... args) {
		int i = 128;
		byte b = 5;
		b = (byte) i;
		System.out.println(b);
	}
}
