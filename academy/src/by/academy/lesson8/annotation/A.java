package by.academy.lesson8.annotation;

@Version(minArgs = 1, info = "12", aliases = { "asd", "asdad", "asdasd" })
public class A {
	
	@Version(info = "13")
	int test = 0;
	
	@Version(info = "14")
	public void test() {
		
	}
}
