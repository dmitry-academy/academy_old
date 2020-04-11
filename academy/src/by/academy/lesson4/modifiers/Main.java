package by.academy.lesson4.modifiers;

public class Main {
	public static void main(String... args) {
		Car car = new Car();

		car.checkOil(); // package friendly - same package - no error
		car.drive(); // public - no error
		car.runEngine(); // same package - no error
		car.burnPetrol(); // private - error
	}
}
