package by.academy.lesson6.wrappers;

public class AutoBoxDemo1 {
	public static void main(String[] args) {
//		int i = iOb; // распаковать
//
//
//		Integer intObject = 100;
//
//		System.out.println(i + " " + iOb);
		int in = 100;
		Integer iOb = 100; // упаковать значение int
		test(iOb);
		test(in);
//		test("test");

	}

	private static void test(Integer sdfasdf) {
		System.out.println("Integer");
	}

	private static void test(String i) {
		System.out.println("String");
	}

//	private static void test(int i) {
//		System.out.println("int");
//	}
}