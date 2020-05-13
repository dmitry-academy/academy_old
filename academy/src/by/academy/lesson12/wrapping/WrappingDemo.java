package by.academy.lesson12.wrapping;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WrappingDemo {
	public static void main(String... args) throws IOException {
		// Потокам можно придать новые свойства, заключив один поток в оболочку другого
		// потока.
		// Класс BufferedReader может быть применен для более эффективного чтения
		// символов, массивов и строк.
		BufferedReader in = new BufferedReader(new FileReader("foo.in"));

		// Классы BufferedWriter и PrintWriter могут быть использованы для более
		// эффективной
		// записи символов, массивов, строк и других типов данных.
		BufferedWriter out = new BufferedWriter(new FileWriter("foo.out"));
		PrintWriter outP = new PrintWriter(new BufferedWriter(new FileWriter("foo.out")));
	}
}
