package by.academy.lesson5.classwork;

public class StringDemo {

	public static void main(String[] args) {
//		String str = new String("string");
//		String str1 = "string1";
//
//		Car car = new Car();
//
//		System.out.println(car);

		String str1 = "Первая строка";
		String str2 = "Вторая строка";
		String str4 = " и ";
		String str3 = str1 + " и " + str2;
		String str5 = str1.concat(str4);

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

		System.out.println(str5);

		System.out.println("string " + (5 + 6));
		System.out.println("---------------------------");
		String s1 = null;
		String s2 = "Cat";
		String s3 = new String("Cat");
//		String s4 = s3.intern();
//		System.out.println("s1 == s2 :" + (s1 == s2));
//		System.out.println("s1 == s3 :" + (s1 == s3));
////		System.out.println("s1 == s4 :" + (s1 == s4));

		System.out.println("s1 equals s2 :" + (s1.equals(s2)));
		System.out.println("s1 equals s3 :" + (s1.equals(s3)));
		System.out.println("Cat equals s2 :" + ("Cat".equals(s2)));
		System.out.println("s1 equals Cat :" + (s2.equals("Cat")));
		System.out.println("s1 equals Cat :" + (s2.equals("Cat")));
	}

}
