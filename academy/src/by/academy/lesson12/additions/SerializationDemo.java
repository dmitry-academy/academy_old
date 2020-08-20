package by.academy.lesson12.additions;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class SerializationDemo {

	public static void main(String[] args) throws IOException {

		User user = new User();
		user.setFirstName("Vasia");
		user.setLastName("Pupkin");
		user.setPassword("qwerty");

		FileOutputStream fos = new FileOutputStream("SerializationDemo.tmp");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(user);
		oos.writeInt(12345);
		oos.writeObject("Today");
		oos.writeObject(new Date());
		oos.close();

	}

}
