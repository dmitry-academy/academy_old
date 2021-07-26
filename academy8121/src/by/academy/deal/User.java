package by.academy.deal;

import java.util.Objects;

public class User {

	private String name;
	private String email;
	private double money;

	public User() {
		super();
	}

	public User(String name, String email, double money) {
		super();
		this.name = name;
		this.email = email;
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, money, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(email, other.email)
				&& Double.doubleToLongBits(money) == Double.doubleToLongBits(other.money)
				&& Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [name=");
		builder.append(name);
		builder.append(", email=");
		builder.append(email);
		builder.append(", money=");
		builder.append(money);
		builder.append("]");
		return builder.toString();
	}

}
