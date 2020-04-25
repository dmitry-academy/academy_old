package by.academy.lesson8.wildcards;

public class MainWildcards {

	public static void main(String[] args) {
		NumberBox<Number> box = new NumberBox<>();

//		NumberBox<? extends Integer> value = new asdasd
		NumberBox<Integer> boxInteger = new NumberBox<>();

		NumberBox<Number> boxNumber = new NumberBox<>();

		box.printInt(boxInteger);// верхняя граница

		box.printDouble(boxNumber);// нижняя граница

	}

}
