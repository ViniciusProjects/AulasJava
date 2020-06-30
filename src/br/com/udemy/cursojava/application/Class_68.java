package br.com.udemy.cursojava.application;

import java.util.Scanner;

import br.com.udemy.cursojava.entity.Rectangle;

public class Class_68 { // fazer mais dois exercicios dessa aula
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		System.out.println("Enter rectangle width and height: ");
		rectangle.width = sc.nextDouble();
		rectangle.Height = sc.nextDouble();

		System.out.printf("AREA = %.2f%n", rectangle.Area());
		System.out.printf("PERIMETER = %.2f%n", rectangle.Perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rectangle.Diagonal());

		sc.close();
	}

}
