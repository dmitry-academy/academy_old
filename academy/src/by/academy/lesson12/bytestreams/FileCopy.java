package by.academy.lesson12.bytestreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	
	
	public static void main(String[] args) throws IOException {
		FileInputStream fileIn = null;
		FileOutputStream fileOut = null;
		int counter = 0;
		try {
			fileIn = new FileInputStream("1.txt.lnk");
			fileOut = new FileOutputStream("copied_file.txt");

			int a;

			while ((a = fileIn.read()) != -1) {
				counter++;
				fileOut.write(a);
			}
		} finally {
			if (fileIn != null) {
				fileIn.close();
			}
			if (fileOut != null) {
				fileOut.close();
			}
		}
		System.out.println(counter);
	}
}