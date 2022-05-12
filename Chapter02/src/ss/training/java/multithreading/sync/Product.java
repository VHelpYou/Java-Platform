package ss.training.java.multithreading.sync;

import java.util.LinkedList;

public class Product {
	
	LinkedList<Integer> productList = new LinkedList<>();
	int productCapcity = 5;
	
	Product(int capacity) {
		this.productCapcity = capacity;
	}
	
	public Product() {
		
	}

	public LinkedList<Integer> getProductList() {
		return productList;
	}

	public void setProductList(LinkedList<Integer> productList) {
		this.productList = productList;
	}

	public int getProductCapcity() {
		return productCapcity;
	}

	public void setProductCapcity(int productCapcity) {
		this.productCapcity = productCapcity;
	}
	
	
}
