package by.academy.lesson2.animal;

public class AnimalPlayDemo {

	public static void main(String[] args) {

		Object obj = new Cat();

		if (obj instanceof Cat) {
			System.out.println("This is a Cat!");
		} else {
			System.out.println("This is not a Cat!");
		}

	}

}
