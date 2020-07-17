package by.academy.lesson5.dealmaker;

public class Main {

	public static void main(String[] args) {
		Product p1 = new Product();

		p1.setPrice(1000);
		p1.setQuantity(10);
		p1.setTitle("Винишко");
		p1.printInfo();

		Product p2 = new Product();

		p2.setPrice(30000);
		p2.setQuantity(3);
		p2.setTitle("Стул Компьютерный");
		p2.printInfo();

	}

}
