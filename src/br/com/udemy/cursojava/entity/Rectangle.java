package br.com.udemy.cursojava.entity;

public class Rectangle {
	public double width;
	public double Height;

	public Rectangle(double width, double height) {
		this.width = width;
		Height = height;
	}

	public Rectangle() {

	}

	public double Area() {
		return width * Height;

	}

	public double Perimeter() {
		return 2 * (width + Height);
	}

	public double Diagonal() {
		return Math.sqrt(width * width + Height * Height);
	}
}
