package by.academy.lesson4.loops;

public class BreakLoop5 {
	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {
			System.out.print("Пpoxoд " + i + " : ");
			for (int j = 0; j < 3; j++) {
				System.out.print(j + " ");
				for (int m = 0; m < 10; m++) {
					System.out.print(m + " ");
					if (m == 5) {
						break;
					}
				}
			}
			System.out.println("Этa строка не будет выводиться");
		}
	}
}