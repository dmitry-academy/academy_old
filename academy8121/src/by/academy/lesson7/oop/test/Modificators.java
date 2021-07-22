package by.academy.lesson7.oop.test;

public class Modificators {
	public int publicVar; // открытый уровень доступа
	private int privateVar; // закрытый уровень доступа
	int defaultVar; // уровень доступа по умолчанию
	protected int protectedVar; // уровень доступа по protected

	@Override
	public String toString() {
		return "Modificators{" + "publicVar=" + publicVar + ", privateVar=" + privateVar + ", defaultVar=" + defaultVar
				+ '}';
	}
}