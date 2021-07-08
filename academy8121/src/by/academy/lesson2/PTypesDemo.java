package by.academy.lesson2;

public class PTypesDemo {
	static int pType;
	static String sGlobal;

	public static void main(String... args) {
		int a = 10, b = 10, c = 10;
		System.out.println(a);
		byte i = Byte.MAX_VALUE;

		byte result = (byte) (i + 1);

		System.out.println(result);

		double averageMark = 4.12;
		int averageInt = (int) averageMark;
		double averageDouble = averageInt;

		System.out.println(averageDouble);
	}
}
