package by.academy.lesson9.inner.anonymous;

public class Food {

	public static void main(String[] args) {

		Potato potato = new Potato() {
			@Override
			public void peel() {
				System.out.println("Чистим картошку в анонимном классе.");
			}
		};

		potato.peel();

		Potato potato2 = new Potato();
		potato2.peel();
	}
}