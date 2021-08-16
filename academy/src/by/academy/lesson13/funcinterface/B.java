package by.academy.lesson13.funcinterface;

@FunctionalInterface
interface B {
	default int defaultMethod() {
		return 0;
	}

	default int anotherDefaultMethod() {
		return 0;
	}

	void method();
}