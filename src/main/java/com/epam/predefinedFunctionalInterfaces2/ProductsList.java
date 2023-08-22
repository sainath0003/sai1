package com.epam.predefinedFunctionalInterfaces2;

import java.util.*;


public class ProductsList {

	public List<Product> addProducts(){
		 List<Product> productsList =new ArrayList<>(); 
		 productsList.add(new Product("Ball",90,"kids","Normal"));
		 productsList.add(new Product("Corn",5000,"Food","Normal"));
		 productsList.add(new Product("Apple",700,"Food","Normal"));
		 productsList.add(new Product("Kite",800,"kids","Normal"));
		 productsList.add(new Product("Bat",15000,"kids","Normal"));
		 productsList.add(new Product("Shoes",2000,"Clothes","Normal"));
		 productsList.add(new Product("Shirt",7000,"Clothes","Normal"));
		 productsList.add(new Product("SmartPhone",16000,"Electronic","Normal"));
		 productsList.add(new Product("SmartWatch",10000,"Electronic","Normal"));
		 productsList.add(new Product("Bluetooth",5000,"Electronic","Normal"));
		 productsList.add(new Product("Earphones",90,"Electronic","Normal"));
		 
		return productsList;
		
		
		
	}
}
