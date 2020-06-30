package br.com.udemy.cursojava.entity;

public class Product {
	public String name;
	public double price;
	public int quantity;

	public Product() {

	}

	public Product(String name, double price, int quantity) {

		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;

	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;

	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", quantity=" + quantity + ", totalValueInStoc)="
				+ totalValueInStock() + "]";
	}

}
