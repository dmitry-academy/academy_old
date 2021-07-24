package by.academy.lesson8.interfaces.classwork.demo1;

public interface Seniorable extends Codable, Delegatable, Learnable, Thinkable {

	@Override
	default void test() {
		System.out.println("asdasd");
	}

}
