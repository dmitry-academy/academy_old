package by.academy.lesson8.interfaces.classwork;

import by.academy.lesson8.interfaces.SomeInterface;
import by.academy.lesson8.interfaces.SomeInterfaceImpl1;
import by.academy.lesson8.interfaces.SomeInterfaceImpl2;

public class InstanceOfDemo {
	public static void main(String... args) {

		SomeInterface o1 = new SomeInterfaceImpl1();
		SomeInterface o2 = new SomeInterfaceImpl2();

		SomeInterface[] arr = { o1, o2 };
		arr[0] = o1;
		arr[0] = o1;

		for (SomeInterface o : arr) {
			if (o instanceof SomeInterfaceImpl2) {
				System.out.println("SomeInterfaceImpl2");
			} else {

			}
		}

	}
}
