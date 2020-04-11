package by.academy.lesson3;

public class WhileDemo {

	public static void main(String[] args) {
		int i = 0;
		String test = "test";
		while (i < 1000) {

			switch (test) {
			case "test":
				System.out.println("TEST!");
				break;
			default:
				System.out.println("default!");
			}
		}

		System.out.println("RESULT:" + i);
	}

}
