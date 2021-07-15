package by.academy.lesson4.classwork;

public class Task18 {
//	18. Задано натуральное число N. 
//	Найти количество натуральных чисел, 
//	не превосходящих N и не делящихся ни на одно из чисел 2,3,5.
	public static void main(String[] args) {
		int number = 256;
		int counter = 0;
		for (int i = 0; i <= number; i++) {

			boolean t = i % 2 != 0 & i % 3 != 0 & i % 5 != 0;

			if (t) {
				System.out.print(i + ", ");
				counter++;
			}
		}
		System.out.println();
		System.out.println("counter: " + counter);
	}

}
