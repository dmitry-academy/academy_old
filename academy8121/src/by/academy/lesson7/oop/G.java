package by.academy.lesson7.oop;

public class G extends F {

	int i = 5;

	public G() {
//		super(1000);
		System.out.println(i);

		System.out.println(super.i);

		System.out.println("В конструкторе G");
	}
}