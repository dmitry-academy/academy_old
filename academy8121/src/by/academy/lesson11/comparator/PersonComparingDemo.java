package by.academy.lesson11.comparator;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class PersonComparingDemo {
	public static void main(String[] args) {
//		Comparator<Person> personComparator = Comparator.comparing(Person::getLastName).thenComparing(Person::getAge);

		Comparator<Person> personComparator = new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				int anotherPersonAge = o2.getAge();
				return o1.getAge() - anotherPersonAge;
			}

		};
		SortedSet<Person> set = new TreeSet<>(personComparator);
		set.add(new Person("Саша", "Иванов", 36));
		set.add(new Person("Маша", "Петрова", 23));
		set.add(new Person("Даша", "Сидорова", 34));
		set.add(new Person("Вася", "Иванов", 25));

		for (Person p : set) {
			System.out.println(p);
		}
	}
}