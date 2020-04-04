package by.academy.lesson3;

public class InfinityLoop {

	public static void main(String... args) {
		for (;;) {
			System.out.println("Infinity loop!");
		}
	}

	void printFirstFiveElements(int count) {
		for (int i = 1; i <= count; i++) {
			System.out.println(i);
			if (i == 5)
				return;
		}
	}

}
