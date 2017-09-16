package basket;

import java.util.ArrayList;

import goods.*;

public class Basket {

	private ArrayList<Article> basket;

	public Basket() {
		basket = new ArrayList<Article>();
	}

	public void add(Article a) {
		basket.add(a);
	}

	public void printRecive() {
		int quantity;
		double price;
		double total = 0;
		double salesTaxes = 0;
		for (Article article : basket) {
			quantity = article.getQuantity();
			price = article.getTaxedPrice() * quantity;
			total = total + price;
			System.out.println(quantity + " " + article.getName() + " " + price);
			salesTaxes = salesTaxes + article.getTaxedPrice() - article.getPrice();
			salesTaxes = Article.roundUp(salesTaxes);
		}
		System.out.println("Sales Taxes: " + salesTaxes);
		System.out.println("Total: " + total + "\n");
	}
}
