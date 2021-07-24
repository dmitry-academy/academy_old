package by.academy.lesson7.oop.statics;

public class Runner {
	public static void main(String[] args) {
//		Base ob = new Sub();
//		ob.go();
//		Sub.go();

		StaticDemo s = new StaticDemo();
//		StaticDemo s1 = new StaticDemo();
//
//		s.intVariable++;
//		s1.intVariable++;
		StaticDemo.intVariable++;
//		System.out.println(s.intVariable);
//		System.out.println(s1.intVariable);

//		System.out.println(StaticDemo.intVariable);
//		StaticDemo.doSomething();

	}
}