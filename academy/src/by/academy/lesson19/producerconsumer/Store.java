package by.academy.lesson19.producerconsumer;

class Store {

	private int product = 0;

	public synchronized void get() {
		while (product < 1) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.err.println(e);
			}
		}
		product--;
		System.out.println(Thread.currentThread().getName() + " ------------");
		System.out.println(Thread.currentThread().getName() + " Consumer got 1 product");
		System.out.println(Thread.currentThread().getName() + " Number of products: " + product);
		System.out.println(Thread.currentThread().getName() + " ------------");
		notify();
	}

	public synchronized void put() {
		while (product >= 8) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println(e);

			}
		}
		product++;
		System.out.println(Thread.currentThread().getName() + "------------");
		System.out.println(Thread.currentThread().getName() + "Producer added 1 product");
		System.out.println(Thread.currentThread().getName() + "Number of products: " + product);
		notify();
	}

//	public void get() {
//		while (product < 1) {
//			try {
//				wait();
//			} catch (InterruptedException e) {
//			}
//		}
//		product--;
//		System.out.println("------------");
//		System.out.println("Consumer got 1 product");
//		System.out.println("Number of products: " + product);
//		notify();
//	}
//
//	public void put() {
//		while (product >= 3) {
//			try {
//				wait();
//			} catch (InterruptedException e) {
//			}
//		}
//		product++;
//		System.out.println("------------");
//		System.out.println("Producer added 1 product");
//		System.out.println("Number of products: " + product);
//		notify();
//	}
}
