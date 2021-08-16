package by.academy.lesson12.classwork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
//	Создать статический метод который принимает на вход три параметра: 
//	login, password и confirmPassword. Login должен содержать только латинские буквы, 
//	цифры и знак подчеркивания. 

//	Длина login должна быть меньше 20 символов. 
//	Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException. 

//	Password должен содержать только латинские буквы, цифры и знак подчеркивания. 

//	Длина password должна быть меньше 20 символов. 
//	Также password и confirmPassword должны быть равны. 
//	Если password не соответствует этим требованиям, 
//	необходимо выбросить WrongPasswordException.  

//	WrongPasswordException и WrongLoginException - пользовательские классы

//	исключения с двумя конструкторами – один по умолчанию, 
//	второй принимает сообщение исключения и передает его в конструктор класса Exception. 

//	Обработка исключений проводится внутри метода. 
//	Используем multi-catch block. Метод возвращает true, 
//	если значения верны или false в другом случае.

	private static Pattern p = Pattern.compile("[\\d\\w_]+");

	public static void registration(String login, String password, String confirmPassword)
			throws WrongLoginException, WrongPasswordException {
		if (login.length() > 20) {
			throw new WrongLoginException("Lenght: " + login.length());
		}
		Matcher m = p.matcher(password);
		if (password.length() < 1 || password.length() > 20 || !m.matches() || !password.equals(confirmPassword)) {
			throw new WrongPasswordException("Wrong password: " + password);
		}
	}

	public static boolean preRegistration(String login, String password, String confirmPassword) {
		try {
			registration(login, password, confirmPassword);
			return true;
		} catch (WrongLoginException | WrongPasswordException e) {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(preRegistration("petia", "qwerty13", "qwerty1"));
	}

}
