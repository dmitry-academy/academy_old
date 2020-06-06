package by.academy.lesson18;

public class CreateThreadDemo2 {
	public static void main(String... args) {

		
		 HelloThread helloThread1 = new HelloThread(); 
		 helloThread1.start();
		 HelloThread helloThread2 = new HelloThread(); 
		 helloThread2.start();
		 HelloThread helloThread3 = new HelloThread(); 
		 helloThread3.start();
		 HelloThread helloThread4 = new HelloThread(); 
		 helloThread4.start();

		
		System.out.println("maiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiin");
	}
}
