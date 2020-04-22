package by.academy.lesson7.date;

import java.util.Date;

public class DateContrsuctorsDemo {

	public static void main(String... args) {
		Date now = new Date();
		System.out.println("Now: " + now);

		Date specificDate = new Date(2141111119);
		System.out.println("Specific Date: " + specificDate);

		Date specificDateDepricated = new Date(2020 - 1900, 11, 30);
		System.out.println("Specific Depricated Date: " + specificDateDepricated);
		test();
	}

	@Deprecated
	public static void test() {
		System.out.println("I'm working!");
	}
}
