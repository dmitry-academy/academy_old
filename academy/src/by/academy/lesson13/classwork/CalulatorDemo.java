package by.academy.lesson13.classwork;

import java.util.HashMap;
import java.util.Map;

public class CalulatorDemo {

	public static void main(String[] args) {
		Map<String, CalculatorFunction> catalog = new HashMap<>();
		catalog.put("+", (d,c)->d+c);
		catalog.put("-", (d,c)->d-c);
		catalog.put("*", (d,c)->d*c);
		catalog.put("/", (d,c)->d/c);
		System.out.println(catalog.get("+").calk(1.0, 2.0));

	}

}
