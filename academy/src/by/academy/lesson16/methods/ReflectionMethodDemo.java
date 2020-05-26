package by.academy.lesson16.methods;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

import by.academy.lesson16.Car;
import jdk.jfr.Description;

public class ReflectionMethodDemo {

	public static void main(String[] args) {
		Car car = new Car(100, "AA180A1");
		Class<? extends Car> carClass = car.getClass();

		Method getHorsepowerMethod;
		try {
			getHorsepowerMethod = carClass.getMethod("getHorsepower");
			System.out.println("Method name: ");
			System.out.println(getHorsepowerMethod.getName());
			System.out.println();

			// Modifiers
			int modifiers = getHorsepowerMethod.getModifiers();
			System.out.println("Modifiers: ");
			System.out.println("Is public: " + Modifier.isPublic(modifiers));
			System.out.println("Is final: " + Modifier.isFinal(modifiers));
			System.out.println("Is volatile: " + Modifier.isVolatile(modifiers));
			System.out.println();

			System.out.println("Return types(getHorsepower): ");
			System.out.println(getHorsepowerMethod.getReturnType());
			System.out.println(getHorsepowerMethod.getGenericReturnType());
			
			Method logAndReturnMethod = carClass.getMethod("logAndReturn", Object.class);
			System.out.println("Return types(logAndReturn): ");
			System.out.println(logAndReturnMethod.getReturnType());
			System.out.println(logAndReturnMethod.getGenericReturnType());

			Annotation[] annotations = getHorsepowerMethod.getAnnotations();
			System.out.println(Arrays.toString(annotations));

			Description[] annotationsByType = getHorsepowerMethod.getAnnotationsByType(Description.class);
			System.out.println(Arrays.toString(annotationsByType));

			Description descriptionAnnotation = getHorsepowerMethod.getAnnotation(Description.class);
			System.out.println(descriptionAnnotation);

		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
