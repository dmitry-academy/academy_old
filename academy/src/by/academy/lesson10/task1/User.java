package by.academy.lesson10.task1;

public class User {
	private String login;
	private String password;

	public User() {
		super();
	}

	public User(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}

	public static class Query {
		public void printToLog() {
			User user = new User();
			System.out.println("User send request!");
			System.out.println("Login: " + user.login);
			System.out.println("Password: " + user.password);
			System.out.println("---------------");
		}
	}

	public void createQuery() {
		Query q = new Query();
		q.printToLog();
	}

}
