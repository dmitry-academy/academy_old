package by.academy.lesson18;

public class CreateThreadDemo {
	public static void main(String... args) {

		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 15; i++) {
					System.out.println("Ruuuuunnable 1: " + i);
				}
			}

		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 15; i++) {
					System.out.println("Ruuuuunnable 2: " + i);
				}
			}

		}).start();
		System.out.println("maiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiin");
	}
}
