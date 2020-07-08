package by.academy.lesson4.product;

public class Product {

	private String name;
	private double price;
	private int quantity;

	public Product(String name) {
		super();
		this.name = name;
	}

	public Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public double getFullPrice() {
		return price * quantity / 100 * (100 - getDiscount());
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	private int getDiscount() {
		return 10;
	}
}
