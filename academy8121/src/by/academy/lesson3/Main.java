package by.academy.lesson3;

public class Main {

	public static void main(String[] args) {
		int s = 370_000;
		int sec;
		int m;
		int min, h;
		sec = s % 60;
		m = (s - sec) / 60;
		min = m % 60;
		h = (m - min) / 60;
		int hour = h % 24;
		System.out.println(hour + " часов " + min + " минут " + sec + " секунд");
		
		int d = (h - hour) / 24;
		int day = h % 7;
		System.out.println(day + "суток");

		int w = (d - day) / 7;
		System.out.println(w + "недель");
	}
}