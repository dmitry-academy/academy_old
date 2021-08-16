package by.academy.lesson9.inner.statics;

public class Town4 {

	int a = 1;
	static int b = 2;

	public static class Street {
		public void go() {
			System.out.println("Go to the Street." + b);
		}
	}

}