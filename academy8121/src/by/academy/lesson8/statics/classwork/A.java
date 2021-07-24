package by.academy.lesson8.statics.classwork;

public class A {

	public A() {
		super();
		System.out.println("Constructor A");
	}

	static {
		System.out.println("static A1");
	}

	static {
		System.out.println("static A2");
	}

}
