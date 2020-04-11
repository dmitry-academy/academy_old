package by.academy.lesson4.packages;

public abstract class Animal {

	protected String name = "Sobaka";
	protected int age;
	protected int weight;

	public abstract void voice();

	public final void run() {
		System.out.println("Run!");
	}

	public void eat() {
		System.out.println("Eat!");
	}

}
