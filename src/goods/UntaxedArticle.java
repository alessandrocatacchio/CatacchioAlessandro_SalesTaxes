package goods;

public class UntaxedArticle extends Article {

	public UntaxedArticle(String name, double price, int quantity) {
		super(name, price, quantity);
		// untaxed goods ( books, food and medical products ) doesn't have the basic tax
		setTax(getTax() - 10);
		setTaxedPrice();
	}

}
