package by.academy.lesson4.modifiers;

public class CarBMW extends Car {

	public void testCar() {
		drive(); // public
		runEngine(); // protected
		burnPetrol(); // private
		checkOil(); // package friendly
	}

}
