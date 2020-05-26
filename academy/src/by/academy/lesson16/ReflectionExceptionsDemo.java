package by.academy.lesson16;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;

public class ReflectionExceptionsDemo {
	public static void main(String... args) {

		try {
			Method exceptionExampleMethod = Car.class.getDeclaredMethod("logAndReturn");

			Class<?>[] exceptionTypes = exceptionExampleMethod.getExceptionTypes();
			System.out.println(Arrays.toString(exceptionTypes));

			Type[] genericExceptionTypes = exceptionExampleMethod.getGenericExceptionTypes();
			System.out.println(Arrays.toString(genericExceptionTypes));

		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
	}
}
