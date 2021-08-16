package by.academy.lesson16;

import java.lang.reflect.Field;

public class ReflectionChangingValuesDemo {
	public static void main(String... args) {
		Car car = new Car(500, "1233");
		Class<? extends Car> carClass = car.getClass();
		Field serialNumberField;
		try {
			Field horsePowerField = carClass.getDeclaredField("horsepower");
			horsePowerField.setAccessible(true);

			serialNumberField = carClass.getField("serialNumber");
			System.out.println("Horseposer field value:" + horsePowerField.getInt(car));

			System.out.println("Before change:" + serialNumberField.get(car));
			serialNumberField.setAccessible(true);
			serialNumberField.set(car, "37U1");
			System.out.println("After change:" + serialNumberField.get(car));
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
