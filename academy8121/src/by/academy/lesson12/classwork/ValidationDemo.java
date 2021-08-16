package by.academy.lesson12.classwork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationDemo {
//	1.	Создать статический метод который принимает на вход три параметра: login, password и confirmPassword.
//	Login должен содержать только латинские буквы, цифры и знак подчеркивания. 
//	Длина login должна быть меньше 20 символов.
//	Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException. 
//	Password должен содержать только латинские буквы, цифры и знак подчеркивания. 
//	Длина password должна быть меньше 20 символов. Также password и confirmPassword должны быть равны. 
//	Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.  
//	WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами – один по умолчанию, 
//	второй принимает сообщение исключения и передает его в конструктор класса Exception. Обработка исключений проводится внутри метода.
//	Используем multi-catch block. Метод возвращает true, если значения верны или false в другом случае. 
	private static Pattern pattern = Pattern.compile("[a-zA-Z0-9_]{1,20}");

	public static void main(String[] args) {
		String login = "";
		String password = null;
		String confPass = null;
		boolean conf = false;
		try {
			conf = isValid(login, password, confPass);
			System.out.println(conf);
		} catch (WrongLoginException | WrongPasswordException e) {
			System.out.println(e.getMessage());
		}

	}

	public static boolean isValid(String login, String password, String confirmPassword)
			throws WrongLoginException, WrongPasswordException {
		if (login == null) {
			throw new WrongLoginException("Поле логин не заполнено");
		}
		if (password == null) {
			throw new WrongPasswordException("Поле пароль не заполнено");
		}
		if (confirmPassword == null) {
			throw new WrongPasswordException("Поле повторите пароль не заполнено");
		}

		Matcher matchLog = pattern.matcher(login);
		Matcher matchPass = pattern.matcher(password);
		
		if (!matchLog.matches()) {
			throw new WrongLoginException(
					"Логин должен содержать латинские буквы, цифры и нижнее подчеркивание в количестве не больше 20");
		}
		if (!matchPass.matches()) {
			throw new WrongPasswordException(
					"Пароль должен содержать латинские буквы, цифры и нижнее подчеркивание в количестве не больше 20");
		} else if (!password.equals(confirmPassword)) {
			throw new WrongPasswordException("Неверный пароль");
		}
		return true;
	}

}
