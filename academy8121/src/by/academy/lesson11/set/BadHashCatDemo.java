package by.academy.lesson11.set;

import java.util.HashSet;
import java.util.Set;

public class BadHashCatDemo {

	public static void main(String[] args) {

		WrongHashCat cat1 = new WrongHashCat("вася");
		WrongHashCat cat2 = new WrongHashCat("барсик");
		WrongHashCat cat3 = new WrongHashCat("платон");
		WrongHashCat cat4 = new WrongHashCat("кузя");
		WrongHashCat cat5 = new WrongHashCat("вася");
		WrongHashCat cat6 = new WrongHashCat("вася");

		Set<WrongHashCat> set = new HashSet<>();
		set.add(cat1);
		set.add(cat2);
		set.add(cat3);
		set.add(cat4);
		set.add(cat5);
		set.add(cat6);

		System.out.println(set);
	}

}
