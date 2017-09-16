package test;

import basket.Basket;
import goods.*;

public class test {

	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}

	public static void test1() {
		System.out.println("Output 1:\n");
		Basket basket = new Basket();
		Article a1 = new Book("book", 12.49, 1);
		Article a2 = new TaxedArticle("music CD", 14.99, 1);
		Article a3 = new Food("chocolate bar", 0.85, 1);

		basket.add(a1);
		basket.add(a2);
		basket.add(a3);

		basket.printRecive();
	}

	public static void test2() {

		System.out.println("Output 2:\n");
		Basket basket = new Basket();
		Article a1 = new Food("imported box of chocolate ", 10.00, 1);
		Article a2 = new TaxedArticle("imported bottle of perfume", 47.50, 1);

		basket.add(a1);
		basket.add(a2);

		basket.printRecive();
	}

	public static void test3() {
		System.out.println("Output 3:\n");

		Basket basket = new Basket();
		Article a1 = new TaxedArticle("imported bottle of perfume", 27.99, 1);
		Article a2 = new TaxedArticle("bottle of perfume", 18.99, 1);
		Article a3 = new MedicalProduct("packet of headache pills", 9.75, 1);
		Article a4 = new Food("box of imported chocolates", 11.25, 1);

		basket.add(a1);
		basket.add(a2);
		basket.add(a3);
		basket.add(a4);

		basket.printRecive();
	}

}
