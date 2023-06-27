package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Emplyoee;

public class Application {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many employees will be registered?");
		int n = sc.nextInt();
		
		Emplyoee emp[] = new Emplyoee[n];
		
		for (int i=0; i<emp.length; i++) {
			emp[i] = new Emplyoee();
			System.out.printf("Emplyoee #", i+1);
			System.out.println("Id: ");
			emp[i].setId(sc.nextInt());
			System.out.println("Name: ");
			sc.nextLine();
			emp[i].setName(sc.nextLine());
			System.out.println("Salary: ");
			emp[i].setSalary(sc.nextDouble());
		}
		
		System.out.println("Enter the employee id that will have salary increase: ");
		int inc = sc.nextInt();
		System.out.println("Enter the percentage: ");
		double perc = sc.nextDouble();
		
		for (int i=0; i<emp.length; i++) {
			if (emp[i].getId().equals(inc)) {
				emp[i].increaseSalary(perc);
			}
		}
		
		System.out.println("--------------------");
		
		System.out.println("LIST OF EMPLOYEES:");
		for (int i=0; i<emp.length; i++) {
			System.out.println(emp[i].status());
		}
		
		sc.close();
	}
}
