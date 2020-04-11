package by.academy.money;

public class Money {
	long rub;
	char kop;

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
	public double subtraction(Money valueForSub) {
		//
		rub -= valueForSub.transferToRub();
		kop -= valueForSub.transferToKop();
		if ((int) kop < 0) {
			rub--;
			kop = (char) (100 + kop);
		}
		double subResult = rub + (kop * 0.01);
		return subResult;
	}

	public double division(int divider) {
		rub /= divider;
		return divResult;
	}

	public double division(int valueForDiv) {
		long valDiv1 = (rub * 100) + kop;
		long valDiv2 = (valueForDiv.setRub() * 100) + (int) valueForDiv.setKop();
		double divResult = (double) valDiv1 / valDiv2;
		return divResult;
	}

}
