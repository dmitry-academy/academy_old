package by.academy.lesson18.threads.defaultinteruption;

class Incremenator extends Thread {
	
	private volatile boolean mIsIncrement = true;

	// Меняет действие на противоположное
	public void changeAction() {
		mIsIncrement = !mIsIncrement;
	}

	@Override
	public void run() {
		do {
			// Проверка прерывания
			if (!Thread.interrupted()) {
				if (mIsIncrement)
					Program.mValue++; // Инкремент
				else
					Program.mValue--; // Декремент

				// Вывод текущего значения переменной
				System.out.print(Program.mValue + " ");
			} else
				return; // Завершение потока

			try {
				Thread.sleep(1000); // Приостановка потока на 1 сек.
			} catch (InterruptedException e) {
				return; // Завершение потока после прерывания
			}
		} while (true);
	}
}
