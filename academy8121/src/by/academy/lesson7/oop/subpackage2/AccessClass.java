package by.academy.lesson7.oop.subpackage2;

import by.academy.lesson7.oop.Parent;

public class AccessClass {
	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.publicAccessMethod();
//		parent.defaultAccessMethod();
//		parent.protectedAccessMethod();
	}
}