package by.academy.lesson2;

public class DayPrint {

	// Сказать про default значение
	static int test;

	public static void main(String[] args) {
		int s = 3_700_000;
		int sec;

		int m;
		int min;

		int h;
		int hours;

		int d;
		int days;

		int w;

		sec = s % 60;

		m = (s - sec) / 60;
		min = m % 60;

		h = (m - min) / 60;
		hours = h % 24;

		d = (h - hours) / 24;
		days = d % 7;

		w = (d - days) / 7;

		System.out.println(w + " недель " + days + " дней " + hours + " часов " + min + " минут " + sec + " секунд");
	}
}
