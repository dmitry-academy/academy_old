package by.academy.lesson3;

public class IfEsleDemo {

	public static void main(String[] args) {

		int temperature = -11;

		if (temperature < -10) {
			System.out.println("Надеть очень теплую шапку -10");
		}
		if (temperature < -5) {
			System.out.println("Надеть шапку");
		}
		if (temperature < -3) {
			System.out.println("qwert1");
		}
		if (temperature < -2) {
			System.out.println("qwert2");
		}
		if (temperature < 0) {
			System.out.println("qwert3");
		} else {
			System.out.println("Можно без шапки");
		}

	}

}
