package by.academy.lesson7.classwork;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

//3. С помощью SimpleDateFormat пропарсить данные, 
//введеные с консоли, в зависимости от паттерна, к которому дата подходит.
//Вывести строку в следующем формате:
//День: <Day>
//Месяц: <Month>
//Year: <Year>

public class Task3_4 {

	public static SimpleDateFormat format1 = new SimpleDateFormat("d/M/yyyy");
	public static SimpleDateFormat format2 = new SimpleDateFormat("d-M-yyyy");
	public static SimpleDateFormat format3 = new SimpleDateFormat("d/M/yyyy HH:mm");

	public static void main(String... args) throws ParseException {
//4. Конвертировать дату из прошлого задания в календарь. Добавить 3 месяца, 2 дня, 4 часа.
		String[] tests1 = { "50/50/9999", "00/00/0000", "13/12/2020", "9/9/2020", "11" };
		String[] tests2 = { "50-50-9999", "00-00-0000", "13-12-2020", "12-12-2020", "11" };

		for (String t : tests1) {
			boolean isValid = Task2.isValidDateString(t);
			if (isValid) {
				Date date = format1.parse(t);
				System.out.println(date);
				Calendar c = new GregorianCalendar();
				c.setTime(date);

				c.add(Calendar.MONTH, 3);
				c.add(Calendar.DAY_OF_MONTH, 2);
				c.add(Calendar.HOUR, 4);

				System.out.println(format3.format(c.getTime()));
			}
		}

		for (String t : tests2) {
			boolean isValid = Task2.isValidDateString(t);
			if (isValid) {
				Date date = format2.parse(t);
				System.out.println(date);

				Calendar c = new GregorianCalendar();
				c.setTime(date);

				c.add(Calendar.MONTH, 3);
				c.add(Calendar.DAY_OF_MONTH, 2);
				c.add(Calendar.HOUR, 4);

				System.out.println(format3.format(c.getTime()));
			}
		}
	}
}
