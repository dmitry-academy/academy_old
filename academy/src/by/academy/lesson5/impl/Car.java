package by.academy.lesson5.impl;

import java.io.Serializable;

public class Car implements Movable, Serializable {

	private static final long serialVersionUID = 2L;

	private String carBrand = "BMW";
	private Integer kolesaNum = 4;

	public Car(String carBrand, Integer kolesaNum) {
		super();
		this.carBrand = carBrand;
		this.kolesaNum = kolesaNum;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	@Override
	public String toString() {
		return "Car brand: " + carBrand;
	}

	@Override
	public void move() {
		System.out.println("I can move");
	}

}