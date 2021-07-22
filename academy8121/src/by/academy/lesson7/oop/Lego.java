package by.academy.lesson7.oop;

public class Lego extends Toy {

	int koli4estovopupirishek;

	public Lego(String name, int cost, String[] manufacturer, int age, int koli4estovopupirishek) {
		super(name, cost, manufacturer, age);
		this.koli4estovopupirishek = koli4estovopupirishek;
	}

}
