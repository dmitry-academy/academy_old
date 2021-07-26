package by.academy.deal;

import java.util.Arrays;
import java.util.Objects;

public class Deal {

	private Product[] products;
	private User seller;
	private User buyer;

	public Deal() {
		super();
	}

	public Deal(Product[] products, User seller, User buyer) {
		super();
		this.products = products;
		this.seller = seller;
		this.buyer = buyer;
	}

	public double calcFullPrice() {
		double fullPrice = 0;

		if (products != null) {
			for (Product p : products) {
				fullPrice += p.calcPrice();
			}
		}
		return fullPrice;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public User getSeller() {
		return seller;
	}

	public void setSeller(User seller) {
		this.seller = seller;
	}

	public User getBuyer() {
		return buyer;
	}

	public void setBuyer(User buyer) {
		this.buyer = buyer;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(products);
		result = prime * result + Objects.hash(buyer, seller);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if ((obj == null) || (getClass() != obj.getClass()))
			return false;
		Deal other = (Deal) obj;
		return Objects.equals(buyer, other.buyer) && Arrays.equals(products, other.products)
				&& Objects.equals(seller, other.seller);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Deal [products=");
		builder.append(Arrays.toString(products));
		builder.append(", seller=");
		builder.append(seller);
		builder.append(", buyer=");
		builder.append(buyer);
		builder.append("]");
		return builder.toString();
	}

}
