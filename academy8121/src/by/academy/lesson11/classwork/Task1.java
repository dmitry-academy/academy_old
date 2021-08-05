package by.academy.lesson11.classwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import by.academy.lesson7.oop.HeavyBox;

//а) Создать динамический массив, содержащий объекты класса HeavyBox. 
//б) Распечатать его содержимое используя for each. 
//в) Изменить вес первого ящика на 1. 
//г) Удалить последний ящик. 
//д) Получить массив содержащий ящики из коллекции тремя способами и вывести на консоль. 
//е) Удалить все ящики.

public class Task1 {
	public static void main(String... args) {
		List<HeavyBox> list = new ArrayList<>();

		HeavyBox hbox1 = new HeavyBox(1, 2, 3, 4);
		HeavyBox hbox2 = new HeavyBox(2, 3, 4, 4);
		HeavyBox hbox3 = new HeavyBox(3, 4, 5, 4);
		HeavyBox hbox4 = new HeavyBox(4, 5, 6, 4);

		list.add(hbox1);
		list.add(hbox2);
		list.add(hbox3);
		list.add(hbox4);

		for (HeavyBox b : list) {
			System.out.println(b);
		}

		list.get(0).setWeight(1);

		list.remove(list.size() - 1);
		// 1 вариант
		Object[] objectArray = list.toArray();
		System.out.println(Arrays.toString(objectArray));

		// 2 вариант
		HeavyBox[] stringArray1 = new HeavyBox[list.size()];
		list.toArray(stringArray1);
		System.out.println(Arrays.toString(stringArray1));

		// 3 вариант
		HeavyBox[] stringArray2 = list.toArray(new HeavyBox[0]);
		System.out.println(Arrays.toString(stringArray2));

		list.clear();
	}
}
