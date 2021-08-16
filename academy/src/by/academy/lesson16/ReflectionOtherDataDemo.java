package by.academy.lesson16;

import java.lang.reflect.Field;

import jdk.jfr.Description;

public class ReflectionOtherDataDemo {

	public static void main(String... args) {
		Car car = new Car(500, "1233");
		Class<? extends Car> carClass = car.getClass();
		Field horsepowerField;
		try {
			horsepowerField = carClass.getDeclaredField("horsepower");

			Class<?> declaringClass = horsepowerField.getDeclaringClass();
			System.out.println(declaringClass);

			boolean enumConstant = horsepowerField.isEnumConstant();
			System.out.println(enumConstant);

			boolean synthetic = horsepowerField.isSynthetic();
			System.out.println(synthetic);

			boolean canAccess = horsepowerField.canAccess(car);
			System.out.println(canAccess);

			boolean isPresent = horsepowerField.isAnnotationPresent(Description.class);
			System.out.println(isPresent);

		} catch (NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
