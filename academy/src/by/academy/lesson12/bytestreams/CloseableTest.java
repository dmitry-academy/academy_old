package by.academy.lesson12.bytestreams;

import java.io.Closeable;
import java.io.IOException;

public class CloseableTest implements Closeable {
	public void test() {
		System.out.println("alalal");
	}

	@Override
	public void close() throws IOException {
		System.out.println("CLOSED!");
	}

}
