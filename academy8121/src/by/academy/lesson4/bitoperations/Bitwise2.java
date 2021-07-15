package by.academy.lesson4.bitoperations;

public class Bitwise2 {
	public static void main(String[] args) {
		byte a = 13; // 0100 0000
		byte b;
		int i = a >> 2; // 1 0000 0000
//        b = (byte) (a << 2); //0000 0000
//        System.out.println("a = " + a);
		System.out.println("i = " + i);
//        System.out.println("b = " + b);
	}
}