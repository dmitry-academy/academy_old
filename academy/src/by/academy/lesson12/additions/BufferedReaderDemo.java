package by.academy.lesson12.additions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BufferedReaderDemo {
	public static void main(String... args) {

		try {
			File dir = new File("files");
			if (!dir.exists()) {
				dir.mkdir();
			}
			File file = new File(dir, "file.txt");
			
			// поток, который подключается к текстовому файлу
			FileReader fileReader = new FileReader(file);
			// соединяем FileReader с BufferedReader
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			String line;
			while ((line = bufferedReader.readLine()) != null) {
				// выводим содержимое файла на экран построчно
				System.out.println(line);
			}
			// закрываем поток
			bufferedReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
