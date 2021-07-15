package by.academy.lesson5.strings;

public class ValueOfDemo {

	public static void main(String[] args) {
		String longString = String.valueOf(9999999999999l);
		String intString = String.valueOf((int) 9999999);

		System.out.println(intString.getClass());
	}

}
