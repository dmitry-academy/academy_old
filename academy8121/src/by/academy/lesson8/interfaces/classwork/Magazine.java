package by.academy.lesson8.interfaces.classwork;

public class Magazine implements Printable {

	@Override
	public void print() {
		System.out.println("Magazine");
	}

	public static void printMagazine(Printable[] printable) {
		for (Printable o : printable) {
			if (o instanceof Magazine) {
				o.print();
			}
		}
	}

}
