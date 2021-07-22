package by.academy.lesson7.oop.getset;

public class UserDemo {
	public static void main(String[] args) {
		User user = new User("mylogin", "mypassword");
		System.out.println("Логин: " + user.getLogin());
		System.out.println("Пароль: " + user.getPassword());
	}
}