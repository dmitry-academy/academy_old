package by.academy.lesson7.oop;

public class BoxDemo2GetSet {
	public static void main(String[] args) {
		Box myBox = new Box(1, 2, 3);
		// присвоить значение переменным экземпляра mybox
		myBox.setWidth(10);
		myBox.setHeight(20);
		myBox.setDepth(15);
		System.out.println(myBox.toString());

		// рассчитать объем параллелепипеда
		double volume = myBox.width * myBox.height * myBox.depth;
		System.out.println("Объем равен " + volume);
	}
}