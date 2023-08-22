package com.epam.predefinedFunctionalInterfaces;

import java.util.List;
import java.util.function.Predicate;

public class PredefinedFunctionalInterfaces {

	public static void main(String[] args) {
		ProductsList products = new ProductsList();
		List<Product> productList = products.addProducts();
		
		Predicate<Product> checkIfPriceIsGreaterthan100 = product -> product.getPrice()>100;
		Predicate<Product> checkIfPriceIsLessthan100 = product -> product.getPrice()<100;
		Predicate<Product> checkIfPriceIsGreaterthan1000 = product -> product.getPrice()>1000;
		Predicate<Product> checkIfProductBelongsToElectronics = product-> product.getCategory().equalsIgnoreCase("Electronic");
		
		productList.stream().filter(checkIfPriceIsGreaterthan1000).forEach(System.out::println);

		System.out.println();
		
		productList.stream().filter(checkIfProductBelongsToElectronics).forEach(System.out::println);
		
		System.out.println();
		
		productList.stream().filter(checkIfProductBelongsToElectronics.and(checkIfPriceIsGreaterthan100)).forEach(System.out::println);
	
		System.out.println();
		
		productList.stream().filter(checkIfProductBelongsToElectronics .and(checkIfPriceIsLessthan100)).forEach(System.out::println);
		
	}


	
}
