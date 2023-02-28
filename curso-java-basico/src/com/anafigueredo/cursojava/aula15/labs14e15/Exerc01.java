package com.anafigueredo.cursojava.aula15.labs14e15;


// Faça um Programa que peça dois números e imprima o maior deles.
import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {


		Scanner scan = new Scanner (System.in);
		
		
		System.out.println(" Digite um número inteiro:");
		int numero = scan.nextInt(); 
		System.out.println(" Digite outro número inteiro:");
		int numero1 = scan.nextInt(); 
		
		if (numero> numero1) {
			System.out.println("O maior número é:" + numero);
		}else if (numero <numero1) {
			System.out.println("O maior número é:" + numero1);			
		}else if (numero == numero1) {
			System.out.println("números iguais");
		}else{
		System.out.println("Digite um valor válido inteiro");
		}
		
		}

	}


