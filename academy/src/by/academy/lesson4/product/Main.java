package by.academy.lesson4.product;

import java.util.Scanner;

public class Main {

	public static final String CONST_TEST = "test";

	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);

		Integer i = 1;
		Integer i1 = new Integer(1);
		Integer i2 = Integer.getInteger("1");

		Product product = new Product("PC");
		System.out.println("Enter price: ");
		product.setPrice(sc.nextDouble());
		System.out.println("Enter quantity: ");
		product.setQuantity(sc.nextInt());

		// Product product1 = new Product("PC", 1000, 3);
//		Product product2 = new Product("macbook air", 1200, 1);
//		Product product3 = new Product("macbook pro", 3000, 1);
		System.out.println("Full price: ");
		System.out.println(product.getFullPrice());

		System.out.println(product.toString());

		sc.close();
	}
}
