package by.academy.impl;

public class Car implements Movable {

	private String carBrand = "BMW";

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	@Override
	public String toString() {
		return carBrand;
	}

	@Override
	public void move() {
		System.out.println("I can move");
	}

}