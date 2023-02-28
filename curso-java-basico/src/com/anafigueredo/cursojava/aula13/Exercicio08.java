package com.anafigueredo.cursojava.aula13;
/* 8. Faça um Programa que pergunte quanto você ganha por hora e o 
número de horas trabalhadas no mês. Calcule e mostre o total do seu 
salário no referido mês. */

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
     Scanner scan = new Scanner (System.in);
     
     System.out.println("Informe quanto você ganha por hora:");
     double valorHora = scan.nextDouble();
     System.out.println("Informe a quantidade de horas trabalhadas:");
     double qtdHorasTrabalhadas = scan.nextDouble();
     System.out.println("Informe a quantidade de dias trabalhados:");
     int diasTrabalhados = scan.nextInt();
     double salarioMes = (valorHora * qtdHorasTrabalhadas * diasTrabalhados); 
     
     System.out.println("O salário a receber é:" + salarioMes);
     
     
		
		
		
		
		
	}

}
