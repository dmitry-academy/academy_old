package by.academy.lesson4.modifiers;

public class Car {

	public void drive() {
		System.out.println("Машина едет");
	}

	protected void runEngine() {
		System.out.println("Машина запустила мотор");
	}

	private void burnPetrol() {
		System.out.println("Машина сжигает топливо");
	}

	// package-friendly
	void checkOil() {
		System.out.println("Проверить уровень масла");
	}
}
