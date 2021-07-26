package by.academy.deal;

public class Application {
	/**
	 * Необходимо реализовать программу, которая будет позволять вводить сделки
	 * купли-продажи товаров между двумя участниками. В каждой сделке может быть
	 * несколько товаров, сумма сделки рассчитывается из суммы всех товаров. Сумма
	 * каждого товара рассчитывается из его стоимости и количества. Программа должна
	 * позволить ввести информацию о сделках, сохранить ее в памяти и вывести на
	 * экран. Ввод информацию осуществляется с экрана (консоли). Количество
	 * дополнительной информацию о сделке, участнике, товаре придумать самому
	 * (больше одного поля для класса).
	 */
	public static void main(String... args) {
		Deal deal = new Deal();
		User seller = new User();
		User buyer = new User();

		Product[] products = new Product[3];

		products[0] = new Wine("Винишко", 30.0, 1, "White", 3);
		products[1] = new Cheese("Сыр", 45.0, 2, 100);
		products[2] = new Cheese("Сыр", 5.0, 20, 1);

		deal.setBuyer(buyer);
		deal.setSeller(seller);

		deal.setProducts(products);

		System.out.println("Bill:");
		for (Product p : deal.getProducts()) {
			System.out.println(p.getName() + " price: " + p.calcPrice());
		}
		System.out.println("------------------------");
		System.out.println("Full price: " + deal.calcFullPrice());

	}
}
