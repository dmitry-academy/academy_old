package by.academy.lesson8.interfaces;

public class AppStatic {
	public static void main(String... args) {

		StaticCounter s1 = new StaticCounter();
		StaticCounter s2 = new StaticCounter();
		StaticCounter s3 = new StaticCounter();
		StaticCounter s4 = new StaticCounter();
		StaticCounter s5 = new StaticCounter();
		StaticCounter s6 = new StaticCounter();
		System.out.println(StaticCounter.counter);
	}
}
