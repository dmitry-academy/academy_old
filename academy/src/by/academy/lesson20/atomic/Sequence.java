package by.academy.lesson20.atomic;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

class Sequence implements Runnable {
	Thread thread;
	int id;
	int count;
	SequenceGenerator sg;
	List<BigInteger> sequence = new ArrayList<BigInteger>();
	boolean printed = false;

	Sequence(final int id, final int count, SequenceGenerator sg) {
		this.count = count;
		this.id = id;
		this.sg = sg;
		thread = new Thread(this);

		System.out.println("������ ����� " + id);
		thread.start();
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < count; i++) {
				sequence.add(sg.next());
				Thread.sleep((long) ((Math.random() * 2 + 1) * 30));
			}
		} catch (InterruptedException e) {
			System.out.println("����� " + id + " �������");
		}
		System.out.println("����� " + id + " ��������");
		printSequence();
	}

	public void printSequence() {
		if (printed)
			return;
		String tmp = "[";
		for (int i = 0; i < sequence.size(); i++) {
			if (i > 0)
				tmp += ", ";
			String nb = String.valueOf(sequence.get(i));
			while (nb.length() < 9)
				nb = " " + nb;
			tmp += nb;
		}
		tmp += "]";
		System.out.println("������������������ ������ " + id + " : " + tmp);
		printed = true;
	}
}
