package com.epam.predefinedFunctionalInterfaces3;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
	
public static void main(String[] args) {
	
	
	List<Product> productsList = new ProductsList().addProducts();
	GetTotalCostOfAllProducts getTotalCostOfAllProducts =(productList)-> productsList.stream().collect(Collectors.summingDouble(product->product.getPrice()));
	System.out.println(getTotalCostOfAllProducts.getTotalCostOfAllProducts(productsList));
	
	GetTotalCostOfProductsAboveGivenPrice getTotalCostOfProductsAboveGivenPrice =(productList,price)-> productsList.stream().filter(product->product.getPrice()>price).collect(Collectors.summingDouble(product->product.getPrice()));
	System.out.println(getTotalCostOfProductsAboveGivenPrice.getTotalCostOfProductsAboveGivenPrice(productsList, 1000));
	
	GetTotalCostOfProductsOfGivenCategory getTotalCostOfProductsOfGivenCategory =(productList,category)-> productsList.stream().filter(product->product.getCategory().equalsIgnoreCase(category)).collect(Collectors.summingDouble(product->product.getPrice()));
	System.out.println(getTotalCostOfProductsOfGivenCategory.getTotalCostOfProductsOfGivenCategory(productsList,"Electronic"));
	
	GetTotalCostOfProductsOfGivenCategoryAndAboveGivenPrice getTotalCostOfProductsOfGivenCategoryAndAboveGivenPrice =(productList,category,price)-> productsList.stream().filter(product->product.getCategory().equalsIgnoreCase(category)).filter(product->product.getPrice()>price).collect(Collectors.summingDouble(product->product.getPrice()));
	System.out.println(getTotalCostOfProductsOfGivenCategoryAndAboveGivenPrice.getTotalCostOfProductsOfGivenCategoryAndAboveGivenPrice(productsList,"Electronic", 15000));
	
}
}
