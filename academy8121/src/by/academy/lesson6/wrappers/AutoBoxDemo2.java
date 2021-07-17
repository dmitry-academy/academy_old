package by.academy.lesson6.wrappers;

public class AutoBoxDemo2 {
//	До Java 5 работа с классами обертками была более трудоемкой:

	public static void main(String[] args) {
		Integer y = new Integer(567);
		int x = y.intValue();
		x++;
		y = new Integer(x);
		System.out.println("y = " + y);

		Object o = 1;
		int i4 = 1;
		Integer i = null;
		Integer i1 = Integer.valueOf(i);
		Integer i2 = Integer.valueOf("1");
		Integer i5 = Integer.parseInt("32");

	}
}