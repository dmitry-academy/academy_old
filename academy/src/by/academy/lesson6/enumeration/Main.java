package by.academy.lesson6.enumeration;

public class Main {
	public static void main(String... args) {

		System.out.println(Day.valueOf("MONDAY").getValue());
		for (Day d : Day.values()) {
			System.out.println(d);
		}

		System.out.println("Ordinal : " + Day.MONDAY.ordinal());
		Day day = Day.FRIDAY;

		System.out.println("Name: " + day.name());

		
		
		switch (day) {
		case MONDAY:
			System.out.println("Mondays are bad.");
			break;
		default:
			System.out.println("Midweek days are so-so.");
			break;
		}

	}
}
