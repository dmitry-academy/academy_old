package by.academy.impl;

public class Point {
	private int y;
	private int x;

	public Point() {
		this(5);
	}

	public Point(int x) {
		this.x = x;
		this.y = 5;
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
