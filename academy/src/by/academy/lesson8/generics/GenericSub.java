package by.academy.lesson8.generics;

public class GenericSub<T, K> extends GenericSuper<K> {

	private T additionlaObj;

	public GenericSub(T ob, K additionlaObj) {
		super(additionlaObj);
		this.additionlaObj = ob;
	}
}