package by.academy.lesson12;

public class MultiCatch {
	public static void main(String[] args) {
		try {
			int a = args.length;
			int b = 42 / 9;
			int[] c = new int[1];
			c[9] = 6;
			System.out.println("TEST");
		} catch (ArithmeticException e) {
			System.out.println("Деление на ноль." + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println("Уже после блока try-catch-catch.");
	}
}