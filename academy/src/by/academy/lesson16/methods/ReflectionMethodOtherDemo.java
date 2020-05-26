package by.academy.lesson16.methods;

import java.lang.reflect.Method;

import by.academy.lesson16.Car;

public class ReflectionMethodOtherDemo {

	public static void main(String[] args) {
		Car car = new Car(100, "AA180A1");
		Class<? extends Car> carClass = car.getClass();

		try {
			Method getHorsepowerMethod = carClass.getMethod("getHorsepower");
			System.out.println(getHorsepowerMethod.getDeclaringClass());
			System.out.println(getHorsepowerMethod.isSynthetic());
			System.out.println(getHorsepowerMethod.isBridge());
			System.out.println(getHorsepowerMethod.isDefault());
			System.out.println(getHorsepowerMethod.isVarArgs());

		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
	}

}
