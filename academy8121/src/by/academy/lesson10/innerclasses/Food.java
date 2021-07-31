package by.academy.lesson10.innerclasses;

public class Food {
	public static void main(String[] args) {

		Potato potato = new Potato() {
			@Override
			public void peel() {
				specificPeel();
				System.out.println("Чистим картошку в анонимном классе.");
			}
			
			private void specificPeel() {
				System.out.println("some specific method");
			}
		};

//		Potato potato = new Potato();
		potato.peel();
	}
}