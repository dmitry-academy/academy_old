package by.academy.lesson16.methods;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import by.academy.lesson16.Car;

public class ReflectionInvokeExample {
	public static void main(String... args) {

		Car car = new Car(100, "AA180A1");
		Class<? extends Car> carClass = car.getClass();

		Method getHorsepowerMethod;
		try {
			getHorsepowerMethod = carClass.getMethod("getHorsepower");
			Object resultValue = getHorsepowerMethod.invoke(car);
			System.out.println(resultValue);

			Method setHorsepowerMethod = carClass.getMethod("setHorsepower", int.class);
			System.out.println("Before change: " + car.getHorsepower());
			setHorsepowerMethod.invoke(car, 350);
			System.out.println("After change: " + car.getHorsepower());

		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
