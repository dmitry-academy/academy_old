package by.academy.lesson3;

public class IfElseDemo {

	public static void main(String[] args) {
		int i = 33;

		if (i < 4) {
			System.out.println("Привет-привет");
		} else {
			System.out.println("Пока-пока!");
		}

		System.out.println(i < 4 ? "Привет-привет" : "Пока-пока!");

		if (i < 4) {
			System.out.println("Вот сюда");
			if (i < 4) {
				System.out.println("Привет-привет");
			} else {
				System.out.println("Пока-пока!");
				if (i < 4) {
					System.out.println("Привет-привет");
				} else {
					System.out.println("Пока-пока!");
				}

				if (i < 4) {
					System.out.println("Привет-привет");
					if (i < 4) {
						System.out.println("Привет-привет");
						if (i < 4) {
							System.out.println("Привет-привет");
						} else {
							System.out.println("Пока-пока!");
						}
					} else {
						System.out.println("Пока-пока!");
					}
				} else {
					System.out.println("Пока-пока!");
				}

			}

		} else if (i < 5) {
			System.out.println("И Вот сюда");
		} else if (i < 6) {

		}
	}

}
