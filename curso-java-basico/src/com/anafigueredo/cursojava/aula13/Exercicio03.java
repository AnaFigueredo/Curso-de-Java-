package com.anafigueredo.cursojava.aula13;

import java.util.Scanner;

// 3. Faça um Programa que peça dois números e imprima a soma

public class Exercicio03 {

	public static void main(String[] args) {


		Scanner scan = new Scanner (System.in); 
		
		System.out.println("Informe o valor1:");
		int valor1= scan.nextInt();
		System.out.println("Informe o valor2");
		int valor2 = scan.nextInt();
		int soma =  valor1 + valor2;
		System.out.println(" A soma dos dois valores é:"+ soma);
		
		
	}

}
