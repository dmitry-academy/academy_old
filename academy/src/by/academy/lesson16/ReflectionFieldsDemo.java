package by.academy.lesson16;

import java.lang.reflect.Field;

public class ReflectionFieldsDemo {

	public static void main(String[] args) {
// 		example 1
		Class<Car> carClass = Car.class;
//		System.out.println("example 1");
//		Field[] declaredFields = carClass.getDeclaredFields();
//		for (Field field : declaredFields) {
//			System.out.println(field);
//		}

// 		example 2
//		System.out.println("example 2");
//
//		try {
//			Field horsepowerField = carClass.getDeclaredField("horsepower");
//			System.out.println(horsepowerField);
//			Field blaBlaField = carClass.getDeclaredField("bla_bla");
//		} catch (NoSuchFieldException e) {
//			e.printStackTrace();
//		}
//
//// 		example 3
//
////  	getFields() only public
		System.out.println("example 3");

//		Field[] fields = carClass.getFields();
//		for (Field field : fields) {
//			System.out.println(field);
//		}
//
////		example 4
		System.out.println("example 4");

		try {
			Field serialNumberField = carClass.getField("serialNumber");
			System.out.println(serialNumberField);
			Field horsepowerField = carClass.getField("horsepower");
			System.out.println(horsepowerField);
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}

	}

}
