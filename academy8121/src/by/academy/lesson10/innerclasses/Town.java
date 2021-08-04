package by.academy.lesson10.innerclasses;

public class Town {
	private String postCode = "33333";
	private int x = 3;

	public class Street {
		private int house;
		private int x = 2;

		public void printAddress() {
			System.out.println("Город " + Town.this);
			System.out.println("Индекс " + postCode);
			System.out.println("Улица " + this);
			System.out.println("Дом " + house);
			System.out.println("----------------");
		}

		public void testX(int x) {
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(Town.this.x);
		}

		public class House {
			public void test(int x) {
				System.out.println(x);
				System.out.println(Town.this.x);
			}
		}

	}

	public static void main(String[] args) {
		Town town = new Town();

		Town.Street street1 = town.new Street();
		Town.Street street2 = new Town().new Street();

		Town.Street.House house = new Town().new Street().new House();
		house.test(1);
//		town.createStreet();
//		street1.printAddress();
//		street2.printAddress();
//
		street1.testX(1);
	}

	public void createStreet() {
		Street street = new Street();
		street.house = 78;
		street.printAddress();
		System.out.println(postCode);
	}
}