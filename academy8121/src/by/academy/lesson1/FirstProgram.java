package by.academy.lesson1;

public class FirstProgram {

	static Person person4;
	static int qwerty;

	public static void main(String[] args) {
		Person person1 = new Person();
		System.out.println(person1);

		Person person2 = new Person(45);
		System.out.println(person2);

		Person person3 = new Person("Вася");
		System.out.println(person3);

		Person person4 = new Person("Вася", 45);
		System.out.println(person4);

	}

}
