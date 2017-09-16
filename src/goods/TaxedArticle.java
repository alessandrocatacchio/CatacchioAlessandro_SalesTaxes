package goods;

public class TaxedArticle extends Article {

	public TaxedArticle(String name, double price,int quantity) {
		super(name, price,quantity);
		setTaxedPrice();
	}

}
