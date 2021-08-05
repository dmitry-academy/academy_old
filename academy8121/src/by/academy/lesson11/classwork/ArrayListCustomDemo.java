package by.academy.lesson11.classwork;

import java.util.Arrays;

public class ArrayListCustomDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arrInt = {1,2,3};
		ArrayListCustom<Integer> obj = new ArrayListCustom<>(arrInt);
		System.out.println(Arrays.toString(obj.getItems()));
		obj.add(4);
		System.out.println(Arrays.toString(obj.getItems()));
		obj.add(5);
		obj.add(6);
		obj.add(7);
		System.out.println(Arrays.toString(obj.getItems()));
		obj.remove(6);
		System.out.println(Arrays.toString(obj.getItems()));
		obj.remove(3);
		System.out.println(Arrays.toString(obj.getItems()));
		obj.set(6, 7);
		obj.set(0, 32);
		obj.set(7, 5);
		System.out.println(Arrays.toString(obj.getItems()));
	}

}
