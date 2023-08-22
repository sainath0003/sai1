package com.epam.biFunctions;

import java.util.Map;
import java.util.function.BiFunction;

public class Bifunctions {
	BiFunction<String,Double,Product> createProductBiFunction = (name,price)->{
		Product product = new Product();
		product.setName(name);
		product.setPrice(price);
		return product;

	};

	BiFunction<Product,Integer,Double> findTotalCostOfTheCartBiFunction = (product,Quantity)-> product.getPrice()*Quantity;


	public Product createProduct(String name,double price) {


		return createProductBiFunction.apply(name, price);

	}

	public double findTotalCostOfTheCart(Map<Product,Integer> cart) {
		return cart.entrySet().stream().mapToDouble(e->findTotalCostOfTheCartBiFunction.apply(e.getKey(), e.getValue())).sum();
	}


}
