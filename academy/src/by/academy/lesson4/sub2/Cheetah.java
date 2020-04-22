package by.academy.lesson4.sub2;

import by.academy.lesson4.packages.Animal;

public class Cheetah extends Animal {

	
	private Integer speed;
	public Cheetah() {
		super();
		this.speed = 500;
	}
	
	@Override
	public void voice() {
		System.out.println("Rrrrr!");
	}

	public void superRun(Integer i) {
		System.out.println("Object");
	}

}
