package by.academy.lesson5.dealmaker;

import java.util.Scanner;


public class Program {

	public static final int MAX_PRODUCTS = 2;
	public static final int MAX_DEALS = 2;

	private Deal[] deals;

	public static void main(String[] args) {
		new Program().run();
	}

	private void run() {
		input();
		System.out.println("================================");
		output();
	}

	private void output() {
		for (Deal deal : deals) {
			System.out.println("Deal " + deal.getDate());
			System.out.println("    " + deal.getBuyer().getName() + " buys from " + deal.getSeller().getName());

			for (Product product : deal.getProducts()) {
				System.out.println("        " + product.getTitle() + " " + product.getQuantity() + " x "
						+ product.getPrice() + " = " + product.getCost());
			}

			System.out.println("Sum: " + deal.getSum());
			System.out.println("----------------------------");
		}
	}

	private void input() {
		deals = new Deal[MAX_DEALS];

		for (int i = 0; i < deals.length; i++) {
			System.out.print((i + 1) + " of " + deals.length + ": ");
			deals[i] = inputDeal();
		}
	}

	private Deal inputDeal() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Input deal ->");

		System.out.print("  Seller -> ");
		Party seller = inputParty(scan);

		System.out.print("  Buyer -> ");
		Party buyer = inputParty(scan);

		Product[] products = new Product[MAX_PRODUCTS];
		for (int i = 0; i < products.length; i++) {
			products[i] = inputProduct(scan);
		}

		Deal deal = new Deal(buyer, seller, products);
		return deal;
	}

	private Product inputProduct(Scanner scan) {
		System.out.println("  Input product ->");
		String title = keyboard(scan, "    Name");
		String price = keyboard(scan, "    Price");
		String quan = keyboard(scan, "    Quantity");
		String type = keyboard(scan, "    Type");

		Product product = null;

		switch (type) {
//		case "Car":
//			product = new Car();
//			break;
//		case "Vino":
//			product = new Vino();
//			break;
		default:
			product = new Product();
			break;
		}

		product.setTitle(title);
		product.setPrice(Double.valueOf(price));
		product.setQuantity(Integer.valueOf(quan));

		return product;
	}

	private Party inputParty(Scanner scan) {
		String partyName = keyboard(scan, "Party name");
		Party party = new Party();
		party.setName(partyName);
		return party;
	}

	private String keyboard(Scanner scan, String message) {
		System.out.print(message + ": ");
		return scan.next();
	}

}
