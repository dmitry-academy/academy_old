package by.academy.lesson5.deals;

public class Deal {

	private User buyer;
	private User seller;
	private Product[] products;
	private double fullPrice;

	public Deal() {
		super();
	}

	public Deal(User buyer, User seller, Product[] products) {
		super();
		this.buyer = buyer;
		this.seller = seller;
		this.products = products;
	}

	public User getBuyer() {
		return buyer;
	}

	public void setBuyer(User buyer) {
		this.buyer = buyer;
	}

	public User getSeller() {
		return seller;
	}

	public void setSeller(User seller) {
		this.seller = seller;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public double getFullPrice() {
		return fullPrice;
	}

	public void setFullPrice(double fullPrice) {
		this.fullPrice = fullPrice;
	}

	public void deal() {
		double summ = 0;

		for (Product p : products) {
			summ += p.getSumPrice();
		}
		this.fullPrice = summ;
	}
}
