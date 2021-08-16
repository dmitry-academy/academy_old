package by.academy.lesson2;

public class LogicDemo {

	public static void main(String[] args) {
		notExample();
		andExample();
		orExample();
		xorExample();
	}

	public static void notExample() {
		System.out.println("NOT EXAMPLE:");
		System.out.println("NOT false = " + !false);
		System.out.println("NOT true  = " + !true);
		System.out.println();
	}

	public static void andExample() {
		System.out.println("AND EXAMPLE:");
		System.out.println("false AND false = " + (false & false));
		System.out.println("false AND true  = " + (false & true));
		System.out.println("true  AND false = " + (true & false));
		System.out.println("true  AND true  = " + (true & true));
		System.out.println();
	}

	public static void orExample() {
		System.out.println("OR EXAMPLE:");
		System.out.println("false OR false = " + (false | false));
		System.out.println("false OR true  = " + (false | true));
		System.out.println("true  OR false = " + (true | false));
		System.out.println("true  OR true  = " + (true | true));
		System.out.println();
	}

	public static void xorExample() {
		System.out.println("XOR EXAMPLE:");
		System.out.println("false XOR false = " + (false ^ false));
		System.out.println("false XOR true  = " + (false ^ true));
		System.out.println("true  XOR false = " + (true ^ false));
		System.out.println("true  XOR true  = " + (true ^ true));
		System.out.println();
	}
}