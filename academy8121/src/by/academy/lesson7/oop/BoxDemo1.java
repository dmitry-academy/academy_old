package by.academy.lesson7.oop;

public class BoxDemo1 {
	public static void main(String[] args) {
		Box myBox = new Box(1,2,3);
		// присвоить значение переменным экземпляра mybox
		myBox.width = 10;
		myBox.height = 20;
		myBox.depth = 15;
		System.out.println(myBox.toString());

		// рассчитать объем параллелепипеда
		double volume = myBox.width * myBox.height * myBox.depth;
		System.out.println("Объем равен " + volume);
	}
}