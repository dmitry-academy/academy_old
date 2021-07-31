package by.academy.lesson10.classwork;

public class InnerDemo {

	public static final Walkable w = new Walkable() {

		@Override
		public void walk() {
			System.out.println("Я гуляю!");
		}

		@Override
		public void stop() {
			System.out.println("Я не гуляю!");
		}
	};

	public static void main(String... args) {

		w.walk();
		w.stop();

	}

}
