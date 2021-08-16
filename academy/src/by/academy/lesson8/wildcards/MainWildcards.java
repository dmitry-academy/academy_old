package by.academy.lesson8.wildcards;

public class MainWildcards {

	public static void main(String[] args) {
		NumberBox<Number> box = new NumberBox<>();

//		NumberBox<? extends Integer> value = new asdasd
		NumberBox<Integer> boxInteger = new NumberBox<>();

		NumberBox<Double> boxDouble = new NumberBox<>();

		box.printExtends(boxInteger);
		box.printExtends(box);// верхняя граница

		box.printSuper(box);// нижняя граница
		box.printSuper(boxDouble);// нижняя граница
		box.printSuper(boxInteger);// нижняя граница

	}

}
