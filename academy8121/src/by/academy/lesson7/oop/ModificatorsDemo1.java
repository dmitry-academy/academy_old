package by.academy.lesson7.oop;

import by.academy.lesson7.oop.test.Modificators;

public class ModificatorsDemo1 extends Modificators {

	public static void main(String[] args) {

		Modificators object = new Modificators();

//		object.defaultVar = 10;
		object.publicVar = 20;
//		object.protectedVar = 30;
//        object.privateVar = 100; // Ошибка компиляции!
	}

	public void test() {

//		defaultVar = 10; // Ошибка компиляции!
		publicVar = 20;
		protectedVar = 30;
//		privateVar = 100; // Ошибка компиляции!
	}
}