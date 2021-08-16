package by.academy.lesson16;

import jdk.jfr.Description;

public class Car {

	@Description("the power of an engine")
	private int horsepower;
	public final String serialNumber;

	public Car() {
		serialNumber = "";
	}

	public Car(int horsepower, String serialNumber) {
		this.horsepower = horsepower;
		this.serialNumber = serialNumber;
	}

	@Description("the power of an engine")
	public final int getHorsepower() {
		return horsepower;
	}

	void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}

	protected void printSerialNumber() {
		System.out.println(serialNumber);
	}

	private void startEngine() {
		System.out.println("Wroooommmm");
	}

	public <T> T logAndReturn(@Deprecated T type) throws IllegalAccessException {
		System.out.println(type);
		return type;
	}

	public <T extends RuntimeException> void exceptionExample() throws T {
	}

	@Override
	public String toString() {
		System.out.println("asdasd");
		StringBuilder builder = new StringBuilder();
		builder.append("Car [horsepower=");
		builder.append(horsepower);
		builder.append(", serialNumber=");
		builder.append(serialNumber);
		builder.append("]");
		return builder.toString();
	}

	public void printObject() {
		StringBuilder builder = new StringBuilder();
		builder.append("Car [horsepower=");
		builder.append(horsepower);
		builder.append(", serialNumber=");
		builder.append(serialNumber);
		builder.append("]");
		System.out.println(builder.toString());
	}

}