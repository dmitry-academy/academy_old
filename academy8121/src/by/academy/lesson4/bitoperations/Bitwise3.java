package by.academy.lesson4.bitoperations;

public class Bitwise3 {
	// Представьте, что необходимо отправить в сообщении число
	// 560 - пинкод от банковской карты.
	// Если злоумышленник перехватит сообщение,
	// то узнает пинкод и сможет воспользоваться им.
	// Только отправитель и получатель могут знать пинкод.
	// Чтобы этого не произошло придумаем какое-то число -
	// маску и сообщим его получателю заранее.
	// Перед отправкой пинкода зашифруем его -
	// применим побитовую операцию XOR: message^XOR.
	// И результат отправим. Если злоумышленник и перехватит сообщение,
	// он не будет знать как его расшифровать.
	// Адресат получает сообщение, расшифровывает пинкод с
	// помощью имеющейся маски: message^maska.
	public static void main(String[] args) {
		int message = 560;
		int maska = 67;
		int codedMessage = message ^ maska;
		int receivedMesssage = codedMessage ^ maska;
		System.out.println("message = " + message);
		System.out.println("message = " + Integer.toBinaryString(message));
		System.out.println("codedMessage = " + codedMessage);
		System.out.println("codedMessage = " + Integer.toBinaryString(codedMessage));
		System.out.println("receivedMesssage = " + receivedMesssage);
		System.out.println("receivedMesssage = " + Integer.toBinaryString(receivedMesssage));
	}
}