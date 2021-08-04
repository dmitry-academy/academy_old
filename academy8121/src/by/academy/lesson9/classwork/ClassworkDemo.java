package by.academy.lesson9.classwork;

import java.io.Serializable;

import by.academy.lesson7.oop.classwork.Animal;

//6.	а) Создать обобщенный класс с тремя параметрами (T, V, K). 
//Класс содержит три переменные типа (T, V, K), конструктор, 
//принимающий на вход параметры типа (T, V, K),
// методы возвращающие значения трех переменных. 
// Создать метод, выводящий на консоль имена классов для трех переменных класса.
//б) Наложить ограничения на параметры типа: T должен реализовать интерфейс Comparable 
//(классы-оболочки, String), V должен реализовать интерфейс Serializable и расширять класс 
//Animal, K должен расширять класс Number.

public class ClassworkDemo<T extends Comparable<String>, V extends Animal & Serializable, K extends Number> {
	private T variableT;
	private V variableV;
	private K variableK;

	public ClassworkDemo() {
		super();
	}

	public ClassworkDemo(T variableT, V variableV, K variableK) {
		super();
		this.variableT = variableT;
		this.variableV = variableV;
		this.variableK = variableK;
	}

	public T getVariableT() {
		return variableT;
	}

	public void setVariableT(T variableT) {
		this.variableT = variableT;
	}

	public V getVariableV() {
		return variableV;
	}

	public void setVariableV(V variableV) {
		this.variableV = variableV;
	}

	public K getVariableK() {
		return variableK;
	}

	public void setVariableK(K variableK) {
		this.variableK = variableK;
	}

	public String getKName() {
		if (variableK == null) {
			return null;
		}
		return variableK.getClass().getName();
	}

	public String getTName() {
		if (variableT == null) {
			return null;
		}
		return variableT.getClass().getName();
	}

	public static String getName(Object o) {
		if (o == null) {
			return null;
		}
		return o.getClass().getName();
	}

	public String getVName() {
		if (variableV == null) {
			return null;
		}
		return variableV.getClass().getName();
	}

	public static void main(String... args) {
		ClassworkDemo<String, Cat, Integer> demo = new ClassworkDemo<>("sdgsd", new Cat(), 45645);
		System.out.println(demo.getKName());
		System.out.println(demo.getTName());
		System.out.println(demo.getVName());
	}

}
