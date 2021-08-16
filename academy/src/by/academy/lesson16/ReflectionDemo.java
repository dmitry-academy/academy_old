package by.academy.lesson16;

import java.lang.reflect.InvocationTargetException;

public class ReflectionDemo {

	public static void main(String[] args) {
		// example 1
		try {
			Class<?> carClass1 = Class.forName("by.academy.lesson16.Car");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// example 2
		Car car = new Car();
		car.setHorsepower(100);
		Class<? extends Car> carClass2 = car.getClass();

		// example 3
		Class<Car> carClass3 = Car.class;

		Package p = carClass3.getPackage();
		System.out.println("package " + p.getName() + ";");

		try {
			Car obj = (Car) carClass2.getDeclaredConstructor().newInstance();
			System.out.println(obj);
//			Class.forName("by.academy.reflection.Car").getDeclaredConstructor().newInstance();

		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
