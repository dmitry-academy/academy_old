package by.academy.lesson8.generics;

import java.util.ArrayList;
import java.util.List;

public class SuperExtendsDiff {

	public static void main(String[] args) {
		List<? super Integer> foo1 = new ArrayList<Integer>(); // Integer is a "superclass" of Integer (in this context)
		List<? super Integer> foo2 = new ArrayList<Number>(); // Number is a superclass of Integer
		List<? super Integer> foo3 = new ArrayList<Object>(); // Object is a superclass of Integer

		List<? extends Number> foo4 = new ArrayList<Number>(); // Number "extends" Number (in this context)
		List<? extends Number> foo5 = new ArrayList<Integer>(); // Integer extends Number
		List<? extends Number> foo6 = new ArrayList<Double>(); // Double extends Number

	}

}
