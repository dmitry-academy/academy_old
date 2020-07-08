package by.academy.lesson4.finals;

public final class Cat extends Animal {

//	private final int tailNumber;
//
//	private final int earNumber;

//	public Cat() {
//		this.tailNumber = 1;
//		this.earNumber = 2;
//	}

//	public Cat(int tailNumber, int earNumber) {
//		this.tailNumber = tailNumber;
//		this.earNumber = earNumber;
//	}

	@Override
	public void voice() {
		System.out.println("Meaw!");
	}

	@Override
	public void run() {
		System.out.println("Cat run!");
	}
//	@Override
//	public void play() {
//		System.out.println("Meaw!");
//	}

	public int sum(int a, int b) {
		return a + b;
	}
	
	public void test() {
		play();
	}
}
