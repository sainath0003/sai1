package com.epam.biFunctions;

public class Product {
	private String name;
	private double price;
	private String category;
	private int grade;

	
public Product() {
		super();
	}

public Product(String name, double price, String category, int grade) {
	super();
	this.name = name;
	this.price = price;
	this.category = category;
	this.grade = grade;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public int getGrade() {
	return grade;
}
public void setGrade(int grade) {
	this.grade = grade;
}
@Override
public String toString() {
	return "Product [name=" + name + ", price=" + price + ", category=" + category + ", grade=" + grade + "]";
}


}
