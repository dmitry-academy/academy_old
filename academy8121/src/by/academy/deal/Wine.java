package by.academy.deal;

import java.util.Objects;

public class Wine extends Product {

	private String color;
	private double alcohol;

	public Wine() {
		super();
	}

	public Wine(String name, double cost, int quantity, String color, double alcohol) {
		super(name, cost, quantity);
		this.color = color;
		this.alcohol = alcohol;
	}

	@Override
	protected double discount() {
		if ("Red".equals(color)) {
			return 0.25;
		}
		return 0;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getAlcohol() {
		return alcohol;
	}

	public void setAlcohol(double alcohol) {
		this.alcohol = alcohol;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(alcohol, color);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wine other = (Wine) obj;
		return Double.doubleToLongBits(alcohol) == Double.doubleToLongBits(other.alcohol) && color == other.color;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Wine [color=");
		builder.append(color);
		builder.append(", alcohol=");
		builder.append(alcohol);
		builder.append("]");
		return builder.toString();
	}

}
