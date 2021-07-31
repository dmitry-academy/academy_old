package by.academy.lesson10.innerclasses;

public class City {

	public int i = 1;
	public static int j = 2;

	public static class District {

		public void go() {
			System.out.println(j);
			System.out.println("Go to the District.");
		}
	}

	public void test() {
		System.out.println("allala");
	}

	public static void main(String[] args) {
		Town4.Street street = new Town4.Street();
		street.go();
		District district = new District();
		district.go();
	}
}