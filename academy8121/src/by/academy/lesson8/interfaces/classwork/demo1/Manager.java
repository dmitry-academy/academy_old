package by.academy.lesson8.interfaces.classwork.demo1;

public class Manager implements Delegatable, Thinkable {

	@Override
	public void delegatable() {
		// TODO Auto-generated method stub

	}

	@Override
	public void test() {
		Delegatable.super.test();
		Thinkable.super.test();
	}

	@Override
	public void think() {
		// TODO Auto-generated method stub
	}

}
