package by.academy.lesson13;

public class Cilinder {

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cilinder [v=");
		builder.append(v);
		builder.append("]");
		return builder.toString();
	}

	private double v;

	public Cilinder(double v) {
		super();
		this.v = v;
	}

	public double getV() {
		return v;
	}

	public void setV(double v) {
		this.v = v;
	}
}
