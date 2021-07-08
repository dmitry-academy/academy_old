package by.academy.lesson3.logic;

public class BooleanLogic2 {
	public static void main(String[] args) {
		int d = 0;
		int num = 10;

		if (d != 0 && num / d > 10) {
			// Если же логическое выражение переписать как d != 0 & num / d > 10, то правое
			// выражение вычисляться будет. И в этом случае программа выбросит исключение
			// времени выполнения с сообщением - на ноль делить нельзя.
			System.out.println("num = " + num);
		}
	}
}