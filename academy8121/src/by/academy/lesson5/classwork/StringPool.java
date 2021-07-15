package by.academy.lesson5.classwork;

public class StringPool {
	public static void main(String[] args) {
		String s1 = "Cat";
		String s2 = "Cat";
		String s3 = new String("Cat");
//		String s4 = s3.intern();
		System.out.println("s1 == s2 :" + (s1 == s2));
		System.out.println("s1 == s3 :" + (s1 == s3));
		System.out.println("s1 == s3 :" + (s1 != null && s1.equals(s3)));
		System.out.println("Cat == s3 :" + "Cat".equals(s3));
		System.out.println("Cat == s3 :" + s3.equals("Cat"));

//		System.out.println("s1 == s4 :" + (s1 == s4));
	}
}
