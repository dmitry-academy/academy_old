package by.academy.lesson7.oop.statics;

public class Runner {
	public static void main(String[] args) {
		Base ob = new Sub();
		ob.go();
		Sub.go();
	}
}