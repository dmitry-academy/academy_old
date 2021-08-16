package by.academy.lesson12.additions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SerializationTest {
	public static void main(String... args) {

		String[] list = { "one", "two", "three", "four" };

		try {
			File dir = new File("files");
			if (!dir.exists()) {
				dir.mkdir();
			}
			File file = new File(dir, "file.txt");
			if (!file.exists()) {
				file.createNewFile();
			}

			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

			for (String s : list) {
				bufferedWriter.write(s + "\n");
			}

			bufferedWriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
