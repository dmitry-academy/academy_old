package by.academy.lesson3;

public class SwitchDemo2 {
	public static void main(String... args) {

		String s = "StR";

		String s1 = s.toLowerCase();

		switch (s1) {
		case "s":
			System.out.println("число равно 1");
			break;
		case "st":
			System.out.println("число равно 2");
			break;
		case "str":
			System.out.println("число равно 3");
			break;
		case "stri":
			System.out.println("число равно 4");
			break;
		default:
			System.out.println("default");
			break;
		}
	}
}
