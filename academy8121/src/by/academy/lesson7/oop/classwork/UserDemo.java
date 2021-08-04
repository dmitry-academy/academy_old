package by.academy.lesson7.oop.classwork;

public class UserDemo {
//	1.	Создать класс User, содержащий private переменные login, password. 
//	Создать внутренний класс Query в классе User. 
//	Класс Query содержит метод printToLog(), 
//	который распечатывает на консоль сообщение о том что пользователь с таким то логином и 
//	паролем отправил запрос. Класс User, содержит метод createQuery(), 
//	в котором создается объект класса Query и вызывается метод printToLog(). 
//	В методе main(): создать экземпляр класса User и вызвать метод createQuery(); 
//	создать экземпляр класса Query и вызвать метод printToLog() 
//	используя конструкцию user.new Query(); создать экземпляр класса 
//	Query и вызвать метод printToLog() используя конструкцию new User().new Query(); 
//	Переписать класс Query используя статический класс.
	public static void main(String... args) {
		User user1 = new User();
		user1.createQuery();
		User.Query q1 = new User.Query(user1);
		q1.printToLog();
		User.Query q2 = new User.Query();
		q2.printToLog();
	}
}
