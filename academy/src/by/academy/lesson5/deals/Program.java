package by.academy.deals;

public class Program {

	public static void main(String... args) {

		User buyer = new User("Petia IP");
		User seller = new User("Vasia");

		Product stylProduct = new Product("Styl", 100, 40);

		Product jvachkaProduct = new Product("Jvachka", 2, 200);

		Product[] products = { stylProduct, jvachkaProduct };

		Deal dealBetweenPetiaAndVasia = new Deal(buyer, seller, products);

		dealBetweenPetiaAndVasia.deal();

		System.out.println(dealBetweenPetiaAndVasia.getFullPrice());

	}
}
