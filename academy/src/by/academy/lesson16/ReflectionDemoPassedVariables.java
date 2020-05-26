package by.academy.lesson16;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;

public class ReflectionDemoPassedVariables {

	public static void main(String[] args) {
		Car car = new Car(100, "AA180A1");
		Class<? extends Car> carClass = car.getClass();

		Method logAndReturnMethod;
		try {
			logAndReturnMethod = carClass.getMethod("logAndReturn", Object.class);
			System.out.println(logAndReturnMethod.getParameterCount());

			Parameter[] parameters = logAndReturnMethod.getParameters();
			System.out.println(Arrays.toString(parameters));

			Class<?>[] parameterTypes = logAndReturnMethod.getParameterTypes();
			System.out.println(Arrays.toString(parameterTypes));

			Type[] genericParameterTypes = logAndReturnMethod.getGenericParameterTypes();
			System.out.println(Arrays.toString(genericParameterTypes));

			TypeVariable<Method>[] typeParameters = logAndReturnMethod.getTypeParameters();
			System.out.println(Arrays.toString(typeParameters));

			Annotation[][] parameterAnnotations = logAndReturnMethod.getParameterAnnotations();
			System.out.println(Arrays.deepToString(parameterAnnotations));

		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
	}

}
