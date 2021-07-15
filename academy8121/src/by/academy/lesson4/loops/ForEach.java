package by.academy.lesson4.loops;

public class ForEach {
	public static void main(String[] args) {

		String[] arr = { "Hello", "world", "academy" };

		for (String str : arr) {
			System.out.println("Значение: " + str);
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Значение: " + arr[i]);
		}

	}
}