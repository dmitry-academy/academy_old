package by.academy.lesson12.additions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class CountSpaces {

	public static void main(String[] args) throws IOException {
		int chr;
		int total;
		int spaces = 0;

		try (Reader in = new FileReader("file.txt")) {
			for (total = 0; (chr = in.read()) != -1; total++) {
				if (Character.isWhitespace((char) chr))
					spaces++;
			}
			System.out.println("Symbols number: " + total + "\nWhitespaces number: " + spaces);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}