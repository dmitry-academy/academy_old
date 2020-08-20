package by.academy.lesson12.bytestreams;

import java.io.FileWriter;
import java.io.IOException;

public class WriterDemo {
	public static void main(String[] args) throws IOException {

		try (FileWriter fileOut = new FileWriter("counter.txt")) {
			for (char i = 0; i < 100; i++) {
				fileOut.write(String.valueOf(i).toCharArray());
				fileOut.write(' ');
			}
		}
	}
}