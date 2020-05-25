package by.academy.lesson13;

public class CarCloneDemo {

	public static void main(String... args) throws CloneNotSupportedException {

		Car car = new Car("test", CarType.COMPACT, 20000, new Engine(1, new Cilinder(1)));
		Car car1 = car.clone();
		
		car.getE().setNumber(2);
		car.setCost(30000);
		
		System.out.println(car);
		System.out.println(car1);

	}
}
