package com.anafigueredo.cursojava.aula15.labs14e15;

/* Faça um Programa que peça um valor e mostre na tela se o valor é
positivo ou negativo.   */


import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
		
		
		System.out.println(" Digite um número inteiro:");
		int numero = scan.nextInt(); 
		
	 if (numero >=0) {        
			System.out.println(" O número é positivo: " + numero);
		 
	 }else if (numero < 0) {	// para saber se um número é negativo, basta ser menor que 0	 
			System.out.println(" O número é negativo: " + numero);

	           }
		  }

	}


