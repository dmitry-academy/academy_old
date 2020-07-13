package by.academy.lesson5.interfacedemo;

public class A implements InterfaceA, InterfaceB {

	@Override
	public void say() {
		System.out.println("say");
	}

	@Override
	public void play() {
		InterfaceA.super.play();
		InterfaceB.super.play();
	}

	@Override
	public void sleepB() {
		System.out.println("sleepB");
	}

	@Override
	public void sleepA() {
		System.out.println("sleepA");
	}
}
