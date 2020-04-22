package by.academy.lesson7.calendar;

import java.util.Calendar;

public class MinimumExample {
	public static void main(String[] args) {
		// creating calendar object
		Calendar calendar = Calendar.getInstance();

		int min = calendar.getMinimum(Calendar.DAY_OF_WEEK);
		System.out.println("Minimum number of days in week: " + min);

		min = calendar.getMinimum(Calendar.WEEK_OF_YEAR);
		System.out.println("Minimum number of weeks in year: " + min);
	}
}
