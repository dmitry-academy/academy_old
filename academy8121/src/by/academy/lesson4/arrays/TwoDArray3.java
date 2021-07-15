package by.academy.lesson4.arrays;

public class TwoDArray3 {
	public static void main(String[] args) {
		double[][][] arrayThreeD = { { { 0, 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9, 10, 11 }, { 12, 13, 14, 15 } },
				{ { 0, 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9, 10, 11 }, { 12, 13, 14, 15 } },
				{ { 0, 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9, 10, 11 }, { 12, 13, 14, 15 } } };
		for (double[][] arrayTwoD : arrayThreeD) {
			for (double[] arrayOneD : arrayTwoD) {
				for (double element : arrayOneD) {
					System.out.print(element + " ");
				}
				System.out.println();
			}
		}
	}
}