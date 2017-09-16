package goods;

public abstract class Article {

	private String name;
	private double price;
	private int quantity;

	// the default tax is 10%
	private int tax = 10;
	private double taxedPrice;

	public Article(String name, double price, int quantity) {
		setName(name);
		setPrice(price);
		setQuantity(quantity);
	}

	protected void isImported() {
		// check if is the article is imported and add 5% taxes
		if (name.contains("imported")) {
			setTax(getTax() + 5);
		}
	}

	protected void setTaxedPrice() {
		isImported();
		int tax = getTax();
		double price = getPrice();
		// if there is a tax, calculate the taxedPrice
		if (tax > 0) {
			double toRoundup = price + (price / 100 * tax);
			this.taxedPrice = roundUp(toRoundup);
		}
		// otherwise set the taxed price as the basic price
		else {
			this.taxedPrice = price;
		}
	}

	public String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	protected void setPrice(double price) {
		this.price = price;
	}

	protected int getTax() {
		return tax;
	}

	protected void setTax(int tax) {
		this.tax = tax;
	}

	public int getQuantity() {
		return quantity;
	}

	protected void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTaxedPrice() {
		return taxedPrice;
	}

	public static double roundUp(double toRound) {
		double roundedUp;
		roundedUp = Math.round(toRound * 100.0) / 100.0;
		return roundedUp;
	}

}
