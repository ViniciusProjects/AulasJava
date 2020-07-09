package br.com.udemy.cursojava.entity;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;

	public Employee() {

	}

	public Employee(String name, double grossSalary, double tax) {
		this.name = name;
		this.grossSalary = grossSalary;
		this.tax = tax;
	}

	public double nextSalary() {
		return grossSalary - tax;
	}

	public double increaseSalary(double percentage) {
		
		return grossSalary += grossSalary * percentage / 100.0;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", grossSalary=" + grossSalary + ", tax=" + tax + "]";
	}
	
	
}
