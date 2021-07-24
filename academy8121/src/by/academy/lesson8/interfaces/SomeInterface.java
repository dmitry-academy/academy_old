package by.academy.lesson8.interfaces;

public interface SomeInterface {

	default String defaultMethod() {
		return "Объект типа String по умолчанию";
	}
}