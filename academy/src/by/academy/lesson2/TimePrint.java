package by.academy.lesson2;

public class TimePrint {

	public static void main(String[] args) {
		int s = 3700;
		int sec;
		int m;
		int min, h;
		sec = s % 60;
		m = (s - sec) / 60;
		min = m % 60;
		h = (m - min) / 60;

		System.out.println(h + " часов " + min + " минут " + sec + " секунд");
	}
}
