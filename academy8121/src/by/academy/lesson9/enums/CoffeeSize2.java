package by.academy.lesson9.enums;

public enum CoffeeSize2 {
	// 100, 150 и 200 передаются в конструктор
	BIG(100, "B") {
		@Override
		public void test() {
		}
	},
	HUGE(150, "H") {
		@Override
		public void test() {
		}
	},
	OVERWHELMING(200, "O") {
		@Override
		public void test() {
		}
	};

	private int ml;
	private String s;

	CoffeeSize2(int ml, String s) {
		this.ml = ml;
		this.s = s;
	}

	public int getMl() {
		return ml;
	}

	public String getS() {
		return s;
	}

	public abstract void test();

}