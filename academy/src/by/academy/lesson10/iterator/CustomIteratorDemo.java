package by.academy.lesson10.iterator;

public class CustomIteratorDemo {
	public static void main(String... args) {
		Integer[] array = { 2, 3, 4, 5, 6, null, null, null };
		CustomIterator<Integer> itr = new CustomIterator<Integer>(array);

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
