package by.academy.lesson8.interfaces.classwork;

public class Book implements Printable {

	@Override
	public void print() {
		System.out.println("Book!");
	}

	public static void printBook(Printable[] printable) {
		for (Printable o : printable) {
			if (o instanceof Book) {
				o.print();
			}
		}
	}
}
