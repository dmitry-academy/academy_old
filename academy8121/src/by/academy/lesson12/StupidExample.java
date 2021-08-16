package by.academy.lesson12;

public class StupidExample {

	public static void main(String[] args) throws MyException {
		try {
			method2();
			System.out.println("Я изучаю Exception");
		} catch (MyException e) {
			System.out.println("alalal");
		} finally {
			method2();
			System.out.println("Выполнюсь всегда.Почти");
		}
	}

	private static void method2() throws MyException {
		throw new MyException(1, "");
	}

}
