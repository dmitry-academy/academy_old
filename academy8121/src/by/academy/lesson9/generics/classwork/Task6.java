package by.academy.lesson9.generics.classwork;

public class Task6 {

	public static void main(String[] args) {
		Generic3Params<Integer, Double, Long> var = new Generic3Params<>(1, 2.3, 4l);
		
		System.out.println(var.getA().getClass());
		System.out.println(var.getB().getClass());
		System.out.println(var.getC().getClass());

	}

}
