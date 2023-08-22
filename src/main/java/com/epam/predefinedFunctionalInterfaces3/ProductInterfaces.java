package com.epam.predefinedFunctionalInterfaces3;

import java.util.*;
public interface ProductInterfaces{
	
}


interface GetTotalCostOfAllProducts{
	double getTotalCostOfAllProducts(List<Product> productsList);
}

interface  GetTotalCostOfProductsAboveGivenPrice
{
	double getTotalCostOfProductsAboveGivenPrice(List<Product> productsList,double i);
}

interface  GetTotalCostOfProductsOfGivenCategory
{
	double getTotalCostOfProductsOfGivenCategory(List<Product> productsList,String category);
}

interface  GetTotalCostOfProductsOfGivenCategoryAndAboveGivenPrice
{
	double getTotalCostOfProductsOfGivenCategoryAndAboveGivenPrice(List<Product> productsList,String category,double price);
}
