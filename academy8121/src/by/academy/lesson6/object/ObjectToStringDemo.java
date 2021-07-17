package by.academy.lesson6.object;

public class ObjectToStringDemo {

	public static void main(String[] args) {
		Person person = new Person("Петров Иван Иванович", 56, false);
		System.out.println(person);

//		System.out.println("Name: " + person.getFullName() + "Age: " + person.getAge());
	}
}
