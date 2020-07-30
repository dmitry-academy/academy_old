package by.academy.lesson10;

public class PrintableDemo {

	public static void main(String[] args) {
		Printable pr = new Printable() {
			@Override
			public void print() {
				System.out.println("ololololo");
			}
		};

		pr.print();
	}

}
