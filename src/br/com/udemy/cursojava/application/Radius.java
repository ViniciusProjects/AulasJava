package br.com.udemy.cursojava.application;

import java.util.Locale;
import java.util.Scanner;

import br.com.udemy.cursojava.entity.Calculator;

public class Radius { //2° versão

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		System.out.println("Enter radius");
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);

		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		
		System.out.printf("PI value: %.2f%n", Calculator.PI);

		sc.close();
	}

}
