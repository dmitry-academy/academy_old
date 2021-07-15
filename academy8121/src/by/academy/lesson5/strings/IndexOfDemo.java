package by.academy.lesson5.strings;

public class IndexOfDemo {
	public static void main(String[] args) {
		String s = "Для работы со строками в языке Java используются классы String, StringBuilder, StringBuffer";

//		System.out.println(s);
//		System.out.println("indexOf(S) = " + s.indexOf('S'));
//		System.out.println("lastIndexOf(r) = " + s.lastIndexOf('r'));
//		System.out.println("indexOf(String) = " + s.indexOf("String"));
//		System.out.println("lastIndexOf(String) = " + s.lastIndexOf("String"));
//		System.out.println("indexOf(S, 60) = " + s.indexOf('S', 60));
		System.out.println("lastIndexOf(S, 70) = " + s.lastIndexOf('S', 70));

		int index = -1;
		int i[] = new int[10];
		int counter = 0;

		do {
			index = s.indexOf("S", index == -1 ? 0 : index + 1);
			if (index != -1) {
				System.out.println(index);
			}
		} while (index != -1);

	}
}