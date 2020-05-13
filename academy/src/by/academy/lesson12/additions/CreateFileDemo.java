package by.academy.lesson12.additions;

import java.io.File;
import java.io.IOException;

public class CreateFileDemo {
	public static void main(String... args) throws IOException {

		File dir1 = new File("files");
		if (!dir1.exists()) {
			dir1.mkdir();
		}
		for (int i = 0; i < 100; i++) {
			File file2 = new File(dir1, i + "_Demo");
			if (!file2.exists()) {
				file2.createNewFile();
			}
		}

	}
}
