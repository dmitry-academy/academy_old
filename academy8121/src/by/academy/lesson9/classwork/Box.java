package by.academy.lesson9.classwork;

import by.academy.lesson7.oop.classwork.Animal;

public class Box<T extends Animal>{ // Average
	T item;
	
	public Box(T item) {
		this.item = item;
	}

	public T getItem() {
		item.eat();
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
	
}
