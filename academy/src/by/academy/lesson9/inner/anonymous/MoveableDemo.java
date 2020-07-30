package by.academy.lesson9.inner.anonymous;

public class MoveableDemo {
	public static void main(String[] args) {
		Moveable moveable = new Moveable() {
			@Override
			public void moveRight() {
				System.out.println("MOVING RIGHT!!!");
			}

			@Override
			public void moveLeft() {
				System.out.println("MOVING LEFT!!!");
				moveForward();
			}

			public void moveForward() {
				System.out.println("MOVING Forward!!!");
			}

		};

		moveable.moveRight();
		moveable.moveLeft();
	}
}