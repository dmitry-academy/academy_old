package by.academy.lesson9.example;

//Внешний класс DataStructure с конструктором для создания 
//и заполнения массива и методом для вывода элементов с четными  индексами.
public class DataStructure {

	private final static int SIZE = 15;
	private int[] arrayOfInts = new int[SIZE];

	public DataStructure() {
		for (int i = 0; i < SIZE; i++) {
			arrayOfInts[i] = i;
		}
	}

	public void printEven() {
		DataStructureIterator iterator = this.new EvenIterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
	}

	interface DataStructureIterator extends java.util.Iterator<Integer> {
	}

	// Внутренний класс EvenIterator, который реализует интерфейс
	// DataStructureIterator, который наследует интерфейс Iterator<Integer>.
	// Итераторы используются для доступа к элементам различных структур данных.
	// Они обычно имеют методы для проверки последнего элемента,
	// получения текущего и следующего элементов.
	private class EvenIterator implements DataStructureIterator {

		private int nextIndex = 0;

		public boolean hasNext() {
			return (nextIndex <= SIZE - 1);
		}

		public Integer next() {
			// Обратите внимание, что класс EvenIterator напрямую обращается
			// к полю arrayOfInts класса DataStructure.
			Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
			nextIndex += 2;
			return retValue;
		}
	}

	// Метод main, который создает объект DataStructure (ds) и вызывает метод
	// printEven для вывода элементов с четными индексами.
	public static void main(String s[]) {
		DataStructure ds = new DataStructure();
		ds.printEven();
	}
}