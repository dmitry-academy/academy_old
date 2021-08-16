package by.academy.lesson16.test;

class ClassA {
	protected int x = 1;

	public void get() {
		System.out.println("A");
	}
}

class ClassB extends ClassA {
	public int x = 2;

	public void get() {
		System.out.println("B");
	}
}

public class Test {
	public static final void main(String[] args) {
		ClassA a = new ClassB();
		System.out.println(a.x);
		a.get();
		int myInt = 0;
		float myFloat = 0;
		try {
			float result = myFloat / myInt;
		} catch (RuntimeException re) {
			System.out.println("Exception 2");
		}
	}
}