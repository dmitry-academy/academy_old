package by.academy.dealmaker;
import java.util.Date;

public class Deal {

	private final Date date = new Date();

	private final Party buyer;

	private final Party seller;

	private final Product[] products;

	public Deal(Party buyer, Party seller, Product[] products) {
		super();
		this.buyer = buyer;
		this.seller = seller;
		this.products = products;
	}

	public double getSum() {
		double result = 0;
		for (Product product : products) {
			result += product.getCost();
		}
		return result;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @return the buyer
	 */
	public Party getBuyer() {
		return buyer;
	}

	/**
	 * @return the seller
	 */
	public Party getSeller() {
		return seller;
	}

	/**
	 * @return the products
	 */
	public Product[] getProducts() {
		return products;
	}
}
