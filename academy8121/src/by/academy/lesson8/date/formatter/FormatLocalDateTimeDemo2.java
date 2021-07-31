package by.academy.lesson8.date.formatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormatLocalDateTimeDemo2 {
	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.of(2020, 1, 1, 0, 0, 0);
		DateTimeFormatter formatter = 
				DateTimeFormatter.ofPattern("MMMM, dd, yyyy HH:mm:ss", Locale.US);
		System.out.println(dateTime.format(formatter));
	}
}