package com.epam.predefinedFunctionalInterfaces2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.logging.Logger;
import java.util.stream.IntStream;

public class PredefinedFunctionalInterfaces {

	public static void main(String[] args) {
		
		List<Product> productList = new ProductsList().addProducts();
		
		Consumer<String> consumer =(parameter) ->{
			if(parameter.equalsIgnoreCase("file"))
			{
				FileWriter fileWriter = null;
				try {
					fileWriter = new FileWriter("Product List");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					fileWriter.write(productList.toString());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}else
			{
				System.out.println("printing in console: ");
				productList.stream().forEach(System.out::println);
				System.out.println();
			}
		}; 
		consumer.accept("console");
		
		Consumer<Product> upgradeGradeToPremium =product->{
			if(product.getPrice()>1000)
				product.setGrade("Premium");
		};
		productList.stream().forEach(upgradeGradeToPremium);
		productList.stream().forEach(System.out::println);
		
		Consumer<Product> addsuffixToProductsAbove3000 =product->{
			if(product.getPrice()>3000)
				product.setName("*"+product.getName());
		};
		productList.stream().forEach(addsuffixToProductsAbove3000);
		productList.stream().forEach(System.out::println);
		
		productList.stream().filter(product->product.getGrade().equalsIgnoreCase("premium")).filter(product-> product.getName().charAt(0)=='*').forEach(System.out::println);
		
		System.out.println();
		Supplier<Product> getRandomProduct = () -> productList.stream().findAny().orElseThrow(null);
		System.out.println(getRandomProduct.get());
		
		Supplier<Integer> getRandomInteger = () -> IntStream.range(120000, 999999).findAny().orElse(000000);;
		System.out.println(getRandomInteger.get());
		
		
	}


	
}
