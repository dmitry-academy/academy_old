package by.academy.lesson9.local;

public class TestLocalClass {
	public void greetInEnglish() {
		interface HelloThere{public void greet();}
		class EnglishHelloThere implements HelloThere {
			public void greet() {
				System.out.println("Hello " + name);
			}
		}
		HelloThere myGreeting = new EnglishHelloThere();
		myGreeting.greet();
	}

	public void sayGoodbyeInEnglish() {
		class EnglishGoodbye {
			public static void sayGoodbye() {
				System.out.println("Bye bye");
			}
		}
		EnglishGoodbye.sayGoodbye();
	}
}
