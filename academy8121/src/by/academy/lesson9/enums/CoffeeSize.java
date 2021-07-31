package by.academy.lesson9.enums;

public enum CoffeeSize {
	BIG(100, "B"), HUGE(200, "H"), OVERWHELMING(300, "O"), SMALL(500, "S");

	private int ml;
	private String alias;

	CoffeeSize(int ml, String alias) {
		this.ml = ml;
		this.alias = alias;
	}

	public int getMl() {
		return ml;
	}

	public String getAlias() {
		return alias;
	}

	public void doSmth() {
		System.out.println(this.alias + " Hello world");
	}

	public String toString1() {
		return "Hello world" + this.alias;
	}
}