package by.academy.lesson15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CalcDemo {
	private static Map<String, CalcOperation> map = new HashMap<String, CalcOperation>();

	static {
		map.put("+", (a, b) -> a + b);
		map.put("-", (a, b) -> a - b);
		map.put("*", (a, b) -> a * b);
		map.put("/", (a, b) -> a / b);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number x : ");
		Double x = sc.nextDouble();

		System.out.println("Enter operation ( + , - , *, / )");
		String operation = sc.next();

		System.out.print("Enter number y : ");
		Double y = sc.nextDouble();
		sc.close();

		System.out.println(calc(x, y, map.get(operation)));
	}

	private static Double calc(Double a, Double b, CalcOperation op) {
		return op.calc(a, b);
	}

}
