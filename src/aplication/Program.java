package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {
	public static void main(String[]args ){
		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);
		
		
		Funcionario funcionario = new Funcionario();
		System.out.println("Name: ");
		funcionario.name = sc.nextLine();
		
		System.out.println("Gross Salary: ");
		funcionario.GrossSalary =sc.nextDouble();
		
		System.out.println("Tax : ");
		funcionario.Tax =sc.nextDouble();
		
		System.out.println(funcionario);
		
		System.out.println("Which percentage to encrease salary? ");
		double percentage = sc.nextDouble();
		funcionario.IncreaseSalary(percentage);
		
		System.out.println("UPDATED DATA: "+ funcionario);
	}
}
