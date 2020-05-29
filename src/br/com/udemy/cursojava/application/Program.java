package br.com.udemy.cursojava.application;

import java.util.Locale;
import java.util.Scanner;

import br.com.udemy.cursojava.entity.Product;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Product product = new Product();
		System.out.println("Enter of product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		System.out.println(product.name + ", " + product.price + ", " + product.quantity );

		sc.close();

	}

}
