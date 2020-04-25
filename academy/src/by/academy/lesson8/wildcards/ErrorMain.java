package by.academy.lesson8.wildcards;

import java.util.ArrayList;
import java.util.List;

public class ErrorMain {
//	Если мы объявили wildcard с extends, то это producer. 
//	Он только «продюсирует», предоставляет элемент из контейнера, а сам ничего не принимает.
//	
//	Если же мы объявили wildcard с super — то это consumer. 
//	Он только принимает, а предоставить ничего не может.

	public static void main(String[] args) {
		
		Box<String> stringBox = new Box<>();
		stringBox.setItem(1);
		stringBox.setItem("sdad");
		
		Box<Integer> intBox = new Box<>();
		intBox.setItem(1);
		stringBox.setItem("sdad");


		
		
		
		
		
		
		
		
		
		
		
		
//		1. Почему в примере ниже compile-time error? Какое значение можно добавить в список nums?
		List<Integer> ints = new ArrayList<Integer>();
		ints.add(1);
		ints.add(2);

		Integer test = 1;
		List<? super Number> nums = ints;
		nums.add(3.14); // compile-time error
		nums.add(4); // compile-time error
		nums.add(test);
		
		List<? extends Number> numTest = new ArrayList<Integer>();
		numTest.add(1);
	}

//2. Почему нельзя получить элемент из списка ниже?
	public static <T> T getFirst(List<? super T> list) {
		return list.get(0); // compile-time error
	}
}

//Нельзя прочитать элемент из контейнера с wildcard ? super, кроме объекта класса Object
