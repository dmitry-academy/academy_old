package by.academy.lesson12.additions;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

public class DeserializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("SerializationDemo.tmp");
		ObjectInputStream ois = new ObjectInputStream(fis);
		User user = (User) ois.readObject();
		int i = ois.readInt();
		String today = (String) ois.readObject();
		Date date = (Date) ois.readObject();
		ois.close();

		System.out.println("User: " + user);
		System.out.println("Integer: " + i);
		System.out.println("String: " + today);
		System.out.println("Date: " + date);

	}

}
