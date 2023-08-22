package com.epam.predefinedFunctionalInterfaces3;

import java.util.*;


public class ProductsList {

	public List<Product> addProducts(){
		 List<Product> productsList =new ArrayList<>(); 
		 productsList.add(new Product("Ball",2500,"kids",3));
		 productsList.add(new Product("Corn",5000,"Food",5));
		 productsList.add(new Product("Apple",700,"Food",9));
		 productsList.add(new Product("Kite",800,"kids",8));
		 productsList.add(new Product("Bat",15000,"kids",7));
		 productsList.add(new Product("Shoes",2000,"Clothes",10));
		 productsList.add(new Product("Shirt",7000,"Clothes",6));
		 productsList.add(new Product("SmartPhone",16000,"Electronic",7));
		 productsList.add(new Product("SmartWatch",10000,"Electronic",8));
		 productsList.add(new Product("Bluetooth",5000,"Electronic",9));
		 
		return productsList;
		
		
		
	}
}
