package com.anafigueredo.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
				
		
		 Scanner scan = new Scanner (System.in);
		 
		 
		 System.out.println(" Informe o valor da hora:");
		 double valorHora = scan.nextDouble();
		 System.out.println(" Informe a quantidade de horas  no mês:");
		 double horasTrabalhadas = scan.nextDouble();
		 double salario = valorHora * horasTrabalhadas; 
		 System.out.println(" O salário é de :" + salario);


	}

}
