package by.academy.lesson5.classes;

public class Car {

	private String carBrand = "BMW";

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = this.carBrand + carBrand + " made in Germany";
	}

	@Override
	public String toString() {
		return carBrand;
	}

}