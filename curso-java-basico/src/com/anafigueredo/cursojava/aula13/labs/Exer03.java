package com.anafigueredo.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {


		Scanner scan = new Scanner (System.in); 
		
		System.out.println(" Digite o segundo número inteiro:");
		int numero1 = scan.nextInt();
		System.out.println(" Digite o primeiro número inteiro:");
		int numero2 = scan.nextInt();
		int soma = numero1 + numero2;
		System.out.println(" A soma dos números é:" + soma);

		
	}

}
