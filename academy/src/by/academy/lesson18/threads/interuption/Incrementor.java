package by.academy.lesson18.threads.interuption;

class Incremenator extends Thread {

	private volatile boolean mIsIncrement = true;
	private volatile boolean mFinish = false;

	// Меняет действие на противоположное
	public void changeAction() {
		mIsIncrement = !mIsIncrement;
	}

	// Инициирует завершение потока
	public void finish() {
		mFinish = true;
	}

	@Override
	public void run() {
		do {
			// Проверка на необходимость завершения
			if (!mFinish) {
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
			}

		} while (true);
	}
}
