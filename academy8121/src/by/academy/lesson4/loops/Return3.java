package by.academy.lesson4.loops;

public class Return3 {

	public static void main(String... args) {
		printFirstFiveElements(10);
	}

	static void printFirstFiveElements(int count) {
		for (int i = 1; i <= count; i++) {
			System.out.println(i);
			if (i >= 6) {
				return;
			}
		}
		System.out.println("ALALALA");
	}

}
