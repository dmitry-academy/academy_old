package by.academy.lesson2;

public class Cat {
	int age;
	String nickname;
	double money;

	public Cat() {

	}

	public Cat(String nickname) {
		this.nickname = nickname;
	}

	public Cat(String nickname, int age) {
		this.nickname = nickname;
		this.age = age;
	}
	
	 
	
	public void grow(int addAge) {
		System.out.println("Кот растет " + addAge + " ����");
		age = age + addAge;
	}

	public void sleep() {
		System.out.println("Кот спит");
	}


	public int getAge() {
		return age;
	}

	public void eat() {
		System.out.println("Кот ест");
	}

	public void walk() {
		System.out.println("Кот гуляет");
	}

	public void printAge() {
		System.out.println("Кот " + nickname + " age " + age);
	}

}
