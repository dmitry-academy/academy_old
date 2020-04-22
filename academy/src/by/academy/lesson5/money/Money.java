package by.academy.lesson5.money;

public class Money {
	private long rub;
	private char kop;

	public Money(double value) {
		transferToRub(value);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Money [rub=");
		builder.append(rub);
		builder.append(", kop=");
		builder.append(kop);
		builder.append("]");
		return builder.toString();
	}

	public void transferToRub(double val) {
		this.rub = val / 100;
		this.kop = val % 100;
	}

	public void transferToRub() {

//		return number of coins
		rub = (int) value;
	}

	public long convertToRub() {

//		return number of coins
		rub = (int) value;
		return rub;
	}

	public char transferToKop() {

		kop = (char) ((value - (int) value) * 100);
		return kop;
	}

//	public double addition(Money valueForAdd) {
//		rub += valueForAdd.setRub();
//		kop += valueForAdd.setKop();
//		if ((int) kop >= 100) {
//			rub++;
//			kop -= 100;
//		}
//		double addResult = rub + (kop * 0.01);
//		return addResult;
//	}
//
	public void subtraction(Money money) {
	}

	public void subtraction(long rub) {
	}

	public void subtraction(char kop) {
	}

	public void subtraction(long rub, char kop) {
	}

	public void division(int divider) {
		rub /= divider;
		kop /= divider;
	}
}
