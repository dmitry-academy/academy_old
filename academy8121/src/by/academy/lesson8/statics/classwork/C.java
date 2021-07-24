package by.academy.lesson8.statics.classwork;

public class C extends B {

	public C() {
		super();
		System.out.println("Constructor C");
	}

	static {
		System.out.println("static C");
	}

}
