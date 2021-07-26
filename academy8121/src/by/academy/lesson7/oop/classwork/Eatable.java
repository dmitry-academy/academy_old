package by.academy.lesson7.oop.classwork;

public interface Eatable extends Walkable, Sleepable {

	@Override
	default void defaultTest() {
		Walkable.super.defaultTest();
		Sleepable.super.defaultTest();
	}

}
