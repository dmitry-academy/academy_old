package by.academy.lesson9.inner.simple;

import java.util.ArrayList;
import java.util.List;

public class Town {
	private String name;
	private String postCode = "33333";
	private List<Street> streets = new ArrayList<Street>();

	public Town() {
		super();
	}

	public Town(String name) {
		super();
		this.name = name;
	}

	public class Street {
		private int house;
		private String name;

		public Street() {
			super();
		}

		public Street(String name) {
			super();
			this.name = name;
		}

		public void printAddress() {
			System.out.println("Город " + Town.this.name);
			System.out.println("Индекс " + postCode);
			System.out.println("Улица " + this.name);
			System.out.println("Дом " + house);
			System.out.println("------------");
		}

		public Town getTown() {
			return Town.this;
		}
	}

	public void createStreet() {
		Street street = new Street("Oktiabrskaia");
		street.house = 78;
		street.printAddress();
		streets.add(street);
	}

	public List<Street> getStreets() {
		return streets;
	}

	public void setStreets(List<Street> streets) {
		this.streets = streets;
	}

	public static void main(String[] args) {
		Town town = new Town("Minsk");
		town.createStreet();
		town.getStreets().get(0).printAddress();

		Town.Street street1 = town.new Street("Brestskaia");

		Town.Street street2 = new Town("Brest").new Street("Minskaia");
		street2.printAddress();
	}
}