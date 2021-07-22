package by.academy.lesson7.oop;

public class D extends C {
	
	public String i;

	public D(String a, int b) {
		i = a;
		super.i = b;
	}

	@Override
	public void print() {
		System.out.println("D.i = " + i);
		super.print();
	}
}
