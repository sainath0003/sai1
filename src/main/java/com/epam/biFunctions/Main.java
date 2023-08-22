package com.epam.biFunctions;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		String name="Bowl";
		double price=500;
		Bifunctions bifunctions =new Bifunctions();
		Product product = bifunctions.createProduct(name, price);
		System.out.println(product);

		Map<Product,Integer> cart = new HashMap<Product, Integer>();
		cart.put(bifunctions.createProduct("door", 2000), 6);
		cart.put(bifunctions.createProduct("car", 1500), 3);
		cart.put(bifunctions.createProduct("mat", 200), 16);

		System.out.println(bifunctions.findTotalCostOfTheCart(cart));

	}
}
