package by.academy.lesson12.additions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class BufferedWriterDemo {
	public static void main(String[] args) {
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
			// поток, который подключается к текстовому файлу
			FileWriter fileWriter = new FileWriter(file);
			// соединяем FileWriter с BufferedWriter
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

			for (String s : list) {
				bufferedWriter.write(s + "\n");
			}
			// закрываем поток
			bufferedWriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
