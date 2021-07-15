package by.academy.lesson4.bitoperations;

public class BitShiftDemo {
	public static void main(String... args) {
		int i = 192;
		i = i << 1;
		i = i >> 1;
//		System.out.println(i);
		i = i >>> 1;
		System.out.println(3 << 1);
//		System.out.println(Integer.toBinaryString(Integer.MIN_VALUE));
//		System.out.println(Integer.toBinaryString(Integer.MIN_VALUE >>> 2));
	}
}
