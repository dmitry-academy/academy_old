package by.academy.lesson5.classwork;

public class Main {
	public static void main(String... args) {

		User seller = new User("Petia");
		User buyer = new User("Vasia");
		
		User user = new User();
		user.setName("Test");
		
		
		Product[] products = { new Product() };

		Deal deal = new Deal(seller, buyer, products);

		Deal deal1 = new Deal(1);
		Deal deal2 = new Deal(new Integer(1));
		Deal deal3 = new Deal(Integer.MAX_VALUE);

	}
}
