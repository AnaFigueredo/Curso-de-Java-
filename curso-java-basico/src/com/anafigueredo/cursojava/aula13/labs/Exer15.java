package com.anafigueredo.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {

				
          Scanner scan = new Scanner (System.in);
		 
		 
		 System.out.println(" Informe o valor da hora:");
		 double valorHora = scan.nextDouble();
		 System.out.println(" Informe a quantidade de horas  no mês:");
		 double horasTrabalhadas = scan.nextDouble();
		 double salarioBruto = valorHora * horasTrabalhadas; 
		 System.out.println(" O salário Bruto é :" + salarioBruto);
		 
		 double inss = salarioBruto * 0.08;       // 0.08 =  (salarioBruto/100) * 8 
		 double sindicato = salarioBruto * 0.05;  // 0.05 =  (salarioBruto/100) * 5 
		 double ir = salarioBruto * 0.11;        // 0.11 =  (salarioBruto/100) * 11 
		 double totalDescontos = ( inss + sindicato + ir); 
		 double salarioLiquido = salarioBruto - totalDescontos ; 
		 
		 System.out.println(" O salário Bruto é : " + salarioBruto);
		 System.out.println(" Desconto INSS : " + inss);
		 System.out.println(" Desconto sindicato : " + sindicato);
		 System.out.println(" Desconto IR:" + ir);
		 System.out.println(" Total de desconto: " + totalDescontos);
		 System.out.println(" O salário líquido: " + salarioLiquido);

		 
		 

	}

}
