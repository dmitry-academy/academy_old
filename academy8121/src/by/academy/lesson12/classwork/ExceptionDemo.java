package by.academy.lesson12.classwork;

public class ExceptionDemo {
	public static void main(String[] args) {
		try {
//			subRoutine(12);
			subRoutine(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("done");
	}

	public static void subRoutine(int i) throws Exception {
		try {
//			subRoutine(12);
			subRoutine4(i);
		} catch (ArithmeticException e) {
			throw new Exception("алалала");
//			System.out.println(e.getMessage());
		}
	}

	public static void subRoutine4(int i) throws ArithmeticException {
		subRoutine3(i);
	}

	public static void subRoutine3(int i) throws ArithmeticException {
		subRoutine2(i);
	}

	public static void subRoutine2(int i) throws ArithmeticException {
		subRoutine1(i);
	}

	public static void subRoutine1(int i) throws ArithmeticException {
		int a = 10 / i;
	}
}
