package by.academy.lesson9.generics;

public class TwoGen<T extends CharSequence, V extends CharSequence> {

	private T obT;
	private V obV;

	public TwoGen() {
		super();
	}

	public String getObtClassName() {

		if (obT == null) {
			return null;
		}
		return obT.getClass().getName();
	}

	public TwoGen(T obT, V obV) {
		this.obT = obT;
		this.obV = obV;
	}

	public void showTypes() {
		System.out.println("Тип T: " + obT.getClass().getName());
		System.out.println("Тип V: " + obV.getClass().getName());
	}

	public T getObT() {
		return obT;
	}

	public V getObV() {
		return obV;
	}
}
