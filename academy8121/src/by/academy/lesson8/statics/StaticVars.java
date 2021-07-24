package by.academy.lesson8.statics;

import java.util.Arrays;

public class StaticVars {
	int a;
	static int b;
	static int c = 3;

	static String[] arr = null;

	{
		arr = new String[10];
		arr[0] = "test string";
	}

	public StaticVars() {
		super();
		System.out.println("StaticVars constructor");
	}

	static {
		arr = new String[10];
		arr[0] = "test string";
		System.out.println("static block");
	}

	public static void main(String[] args) {
		StaticVars staticVars = new StaticVars();
		System.out.println(staticVars.a);
		System.out.println(b);

		System.out.println(Arrays.toString(arr));
	}

	public void test() {

	}
}