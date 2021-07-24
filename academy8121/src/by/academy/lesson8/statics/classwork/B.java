package by.academy.lesson8.statics.classwork;

public class B extends A {

	public B() {
		super();
		System.out.println("Constructor B");
	}

	static {
		System.out.println("static B");
	}

}
