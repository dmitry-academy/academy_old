package by.academy.lesson1;

public class Main {

	public static void main(String... strings) {

		Cat noname = new Cat();
		System.out.println(noname);
		System.out.println("Hello cat!");
		Cat cat = new Cat(5, "Vaska");
//		cat.play();
//		System.out.println(cat.getKolichestvoLap());
//		cat.setKolichestvoLap(4);
//		System.out.println(cat.getKolichestvoLap());

//		cat.changeName("Vasilisa");
//		cat.play();

//		test();
//		test(1);
//		test(45345l);
	}

	public static void test() {
		System.out.println("nothing");
	}

	public static void test(int i) {
		System.out.println("int");
	}

//	public static int test(int i) {
//		System.out.println("int");
//		return 1;
//	}

	public static void test(long i) {
		System.out.println("long");
	}

//	public static int methodWithReturn(int i) {
//		return i;
//	}
}
