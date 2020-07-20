package by.academy.lesson7.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class SimpleCalendarExample {
	public static void main(String... args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
		Calendar calendar = new GregorianCalendar(2013, 0, 31);
		System.out.println(sdf.format(calendar.getTime()));

		Calendar calendar1 = new GregorianCalendar(1, 0, 31);
		System.out.println(calendar1);
		System.out.println(sdf.format(calendar1.getTime()));

	}
}
