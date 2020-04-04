package by.academy.lesson3.arrays;

class ArrayDemo {
	public static void main(String[] args) {

		// Объявили массив интов
		int[] anArray;

		// выделили память для 10 интов
		anArray = new int[10];

		// проинициализировали 1 элемент массива
		anArray[0] = 100;

		// проинициализировали 2 элемент массива
		anArray[1] = 200;
		// and so forth
		anArray[2] = 300;
		anArray[3] = 400;
		anArray[4] = 500;
		anArray[5] = 600;
		anArray[6] = 700;
		anArray[7] = 800;
		anArray[8] = 900;
		anArray = null;
		
		System.out.println("Element at index 0: " + anArray[0]);
		System.out.println("Element at index 1: " + anArray[1]);
		System.out.println("Element at index 2: " + anArray[2]);
		System.out.println("Element at index 3: " + anArray[3]);
		System.out.println("Element at index 4: " + anArray[4]);
		System.out.println("Element at index 5: " + anArray[5]);
		System.out.println("Element at index 6: " + anArray[6]);
		System.out.println("Element at index 7: " + anArray[7]);
		System.out.println("Element at index 8: " + anArray[8]);
		System.out.println("Element at index 9: " + anArray[9]);

		System.out.println(anArray.length);
	}
}
