package by.academy.lesson8.interfaces.classwork;

public class PrintableDemo {
	public static void main(String... args) {

		Printable b = new Book();
		Printable b1 = new Book();
		Printable b2 = new Book();
		Printable b3 = new Book();

		Printable m = new Magazine();
		Printable m1 = new Magazine();
		Printable m2 = new Magazine();

		Printable[] arr = { b, b1, b2, b3, m, m1, m2 };

//		for (Printable p : arr) {
//			p.print();
//		}

//		Magazine.printMagazine(arr);
		
		Book.printBook(arr);

	}
}
