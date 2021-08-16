package by.academy.lesson12.readerwriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
	public static void main(String[] args) {

		int counter = 0;
		try (BufferedReader br = new BufferedReader(new FileReader("file.txt"), 1)) {
			String str;

			while ((str = br.readLine()) != null) {
				System.out.println(str);
				counter++;
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Counter: " + counter);
	}
}