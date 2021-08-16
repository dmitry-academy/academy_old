package by.academy.lesson4.packages;

public abstract class Animal {

	protected String name;
	protected int age;
	protected int weight;

	public Animal() {
		super();
		this.name = "Sobaka";
	}
	
	public abstract void voice();

	public final void run() {
		System.out.println("Run!");
		voice();
	}

	public void eat() {
		System.out.println("Eat!");
	}

	public void superRun(int i) {
		System.out.println("primitive");
	}

}
