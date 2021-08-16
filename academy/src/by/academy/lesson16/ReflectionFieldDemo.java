package by.academy.lesson16;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectionFieldDemo {

	public static void main(String... args) {
		Car car = new Car(500, "1233");
		Class<? extends Car> carClass = car.getClass();
		// Example 1
		try {
			Field serialNumberField = carClass.getDeclaredField("serialNumber");
			String serialNumberValue = (String) serialNumberField.get(car); // ��������� �� ������ ������� �� �����
			System.out.println(serialNumberValue); // output: 1233
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}

		// Example 2
		try {
			Field horsepowerField = carClass.getDeclaredField("horsepower");
			horsepowerField.setAccessible(true);
			int horsepowerValue = horsepowerField.getInt(car);
			System.out.println(horsepowerValue);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}

		// Example 3
		try {
			Field horsepowerField = carClass.getDeclaredField("horsepower");

			String name = horsepowerField.getName();
			System.out.println(name);

			Class<?> type = horsepowerField.getType();
			System.out.println(type);

			int modifiers = horsepowerField.getModifiers();
			System.out.println(modifiers); // output: 2

			System.out.println("isPrivate: " + Modifier.isPrivate(modifiers)); // output: true
			System.out.println("isFinal: " + Modifier.isFinal(modifiers)); // output: false
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException e) {
			e.printStackTrace();
		}
	}
}
