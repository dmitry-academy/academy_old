package by.academy.lesson5.deals;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import by.academy.lesson8.annotation.Version;

@Version(info = "alala")
public class Deal {

	private User buyer;
	private User seller;
	private Product[] products;
	private double fullPrice;
	private Date deadline;

	public Deal() {
		super();
		init();
	}

	public Deal(User buyer, User seller, Product[] products) {
		super();
		this.buyer = buyer;
		this.seller = seller;
		this.products = products;
		init();
	}

	private void init() {
		Calendar c = new GregorianCalendar();
		c.add(Calendar.DAY_OF_MONTH, 10);
		this.deadline = c.getTime();
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Deal [buyer=");
		builder.append(buyer);
		builder.append(", seller=");
		builder.append(seller);
		builder.append(", products=");
		builder.append(Arrays.toString(products));
		builder.append(", fullPrice=");
		builder.append(fullPrice);
		builder.append("]");
		return builder.toString();
	}
}