package by.academy.lesson9.inner.local;

public class Town2 {
	private String postCode = "33333";

	public void createAddress() {
		final int houseNumber = 34;

		class Street {
			public void printAddress() {
				System.out.println("PostCode is " + postCode);
				System.out.println("House Number is " + houseNumber);
			}
		}

		Street street = new Street() {
			public void printAddress() {
				System.out.println("Хехей!");
			}
		};
		street.printAddress();
	}

	public static void main(String[] args) {
		Town2 town = new Town2();
		town.createAddress();
	}
}