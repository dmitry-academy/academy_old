package by.academy.lesson7.date;

import java.util.Date;

public class DateMethodsDemo {
	public static void main(String... args) {
		Date now = new Date();
		Date specificDate = new Date(2141111119);

		System.out.println("Now: " + now);
		System.out.println("Specific Date: " + specificDate);

		System.out.println("Now after specific date? " + now.after(specificDate));
		System.out.println("Now before specific date? " + now.before(specificDate));

		Date clonedDate = (Date) specificDate.clone();

		System.out.println("Now compareTo specific date: " + now.compareTo(specificDate));
		System.out.println("Specific date equals cloned date: " + specificDate.equals(clonedDate));
		System.out.println("Get time from now: " + now.getTime());
		System.out.println("Hash code now: " + now.hashCode());

		now.setTime(123);
		System.out.println("Changed now: " + now);

		System.out.println("toString from now: " + now.toString());
	}
}
