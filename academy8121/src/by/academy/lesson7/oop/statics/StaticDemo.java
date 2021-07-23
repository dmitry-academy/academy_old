package by.academy.lesson7.oop.statics;

public class StaticDemo {

	public static int intVariable = 0;

	static {
		System.out.println("Hello I'm static block");
	}

	{
		System.out.println("Hello I'm block");
	}

	public StaticDemo() {
		super();
		System.out.println("Hello I'm StaticDemo constructor");
	}

	public static void doSomething() {
		System.out.println("Hello I'm static method");
	}

}
