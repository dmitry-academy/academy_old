package by.academy.lesson11.map;

import java.util.HashMap;
import java.util.Map;

//Изменяемые объекты в качестве ключа
public class ProductKeyDemo {
	public static void main(String[] args) {
		Map<Product, String> map = new HashMap<>();
		Product doll = new Product("Кукла", 534d, "Беларусь");
		Product box = new Product("Кубик", 34d, "Беларусь");
		Product car = new Product("Машинка", 200d, "Беларусь");

		map.put(doll, "Антошка");
		map.put(box, "Антошка");
		map.put(car, "Детский мир");

		System.out.println(map.get(doll));
		doll.setCost(434d);

		System.out.println(map.get(doll));
	}
}