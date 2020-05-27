package by.academy.lesson16.annatation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Arrays;

import by.academy.lesson16.Car;
import jdk.jfr.Description;

public class ReflectionAnnotationDemo {
	public static void main(String... args) {
		Car car = new Car(500, "1233");
		Class<? extends Car> carClass = car.getClass();
		try {
			Field horsepowerField = carClass.getDeclaredField("horsepower");
			Annotation[] annotations = horsepowerField.getAnnotations();
			System.out.println(Arrays.toString(annotations));

			Description descriptionAnnotation = horsepowerField.getAnnotation(Description.class);
			System.out.println(descriptionAnnotation);

			Annotation[] annotationsByType = horsepowerField.getAnnotationsByType(Description.class);
			System.out.println(Arrays.toString(annotationsByType));
			
			System.out.println(descriptionAnnotation.value());
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}
}
