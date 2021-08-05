package by.academy.lesson11.classwork;

public class Aplication {
	public static void main(String[] arg) {

		LinkedListCustom<Integer> list = new LinkedListCustom<>();
		// 1,5,4,2,3
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1, 4);
		list.add(1, 5);
		System.out.println(list.getSize());
		System.out.println("----------");
		list.print();
		System.out.println("----------");
		System.out.println(list.get(1));

		
	}
}
