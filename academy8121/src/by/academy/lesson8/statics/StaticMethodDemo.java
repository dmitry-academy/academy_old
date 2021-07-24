package by.academy.lesson8.statics;

public class StaticMethodDemo {
	public static void main(String[] args) {

		StaticMethodClass.staticMethod(42);

		StaticMethodClass c = new StaticMethodClass();
		c.nonStaticMethod();
	}
}