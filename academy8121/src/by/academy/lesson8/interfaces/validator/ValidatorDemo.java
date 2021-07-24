package by.academy.lesson8.interfaces.validator;

public class ValidatorDemo {

	public static void main(String... args) {
		BelarusianPhoneValidator v = new BelarusianPhoneValidator();
		System.out.println("+375291000000: " + v.isValid("+375291000000"));
		System.out.println("+175291000000: " + v.isValid("+175291000000"));
		System.out.println("+375291234567: " + v.isValid("+375291234567"));
	}

}
