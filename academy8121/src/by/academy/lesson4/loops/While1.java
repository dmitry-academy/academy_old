package by.academy.lesson4.loops;

public class While1 {
	public static void main(String[] args) {
		int n = 5;

//		while (n > 0) {
//			System.out.println("Тик " + n--);
//		}
//		System.out.println("End While");

		do {
			System.out.println("Тик " + n--);
		} while (n > 0);
		System.out.println("End Do While");
//		int sum = 0;
//		int i = 0;
//		while (i < 20) {
//			if (i % 2 == 0) {
//				sum += i;
//			}
//			i++;
//		}
//		System.out.print("sum = " + sum);

	}
}
