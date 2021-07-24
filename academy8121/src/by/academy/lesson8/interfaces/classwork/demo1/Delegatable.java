package by.academy.lesson8.interfaces.classwork.demo1;

public interface Delegatable {
	void delegatable();

	default void sayWhatToDo() {
		System.out.println("What to do");
	}

	default void test() {
		System.out.println("test");
	}
}
