package by.academy.lesson7.oop;

public class HeavyBox1 extends Box {
	int weight;

	public HeavyBox1(int width, int height, int depth, int weight) {
		super(width, height, depth);
		this.weight = weight;
	}

	public HeavyBox1() {
		this.weight = -1;
	}
}