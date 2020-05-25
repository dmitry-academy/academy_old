package by.academy.lesson13;

public class Engine {

	private int number;
	private Cilinder c;

	public Engine(int number, Cilinder c) {
		super();
		this.number = number;
		this.c = c;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Cilinder getC() {
		return c;
	}

	public void setC(Cilinder c) {
		this.c = c;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Engine [number=");
		builder.append(number);
		builder.append(", c=");
		builder.append(c);
		builder.append("]");
		return builder.toString();
	}

}
