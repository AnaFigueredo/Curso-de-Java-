package com.anafigueredo.cursojava.aula15.labs14e15;

import java.util.Scanner;

// Faça um Programa que leia três números e mostre o maior deles.
public class Exerc06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println(" Digite um número inteiro:");
		int numero1 = scan.nextInt();
		
		System.out.println(" Digite um segundo número inteiro:");
		int numero2 = scan.nextInt();
		
		System.out.println(" Digite um terceiro número inteiro:");
		int numero3 = scan.nextInt();
		
	/* if (numero1 == numero2 || numero2 == numero3) {
		System.out.println(" Digite um valor válido que seja diferente" );*/
	
	     if (numero1 >= numero2 && numero1 >= numero3) {
			System.out.println(" O maior número é:" + numero1 );
			
		}else if (numero2 >= numero1 && numero2 >= numero3)   {
			System.out.println(" O maior número é:" + numero2 );
		} else {
			System.out.println(" O maior número é:" + numero3 );


	  }
	}
}
