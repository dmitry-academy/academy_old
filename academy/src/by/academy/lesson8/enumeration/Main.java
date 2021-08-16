package by.academy.lesson8.enumeration;

public class Main {

	public static void main(String[] args) {
		Day day = Day.FRIDAY;
		System.out.println("day.name() = " + day.name());
		System.out.println("day.toString() = " + day.toString());
		System.out.println("day.ordinal() = " + day.ordinal());

		System.out.println("Day number = " + day.getDayNumber());
	}

}
