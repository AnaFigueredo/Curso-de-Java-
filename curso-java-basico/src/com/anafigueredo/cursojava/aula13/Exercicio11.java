package com.anafigueredo.cursojava.aula13;

import java.util.Scanner;

/*11.Faça um Programa que peça 2 números inteiros e um número real. 
Calcule e mostre:
a. o produto do dobro do primeiro com metade do segundo .
b. a soma do triplo do primeiro com o terceiro.
c. o terceiro elevado ao cubo */



public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner scan =  new Scanner (System.in);
		
		System.out.println("Informe o primeiro número inteiro:");
		int primeiroNumero = scan.nextInt();
		System.out.println("Informe o segundo número inteiro:");
		int segundoNumero = scan.nextInt();
		System.out.println("Informe um número real:");
		double numeroReal = scan.nextDouble();
		
		double resultado1 =  ((primeiroNumero * primeiroNumero) + (segundoNumero / 2));
		System.out.println("O produto do dobro do primeiro com metade do segundo é: " + resultado1);
		double resultado2 =  ((primeiroNumero * primeiroNumero * primeiroNumero) + (numeroReal));
		System.out.println("A soma do triplo do primeiro com o terceiro é: " + resultado2);
		double resultado3 =  Math.pow (numeroReal, 3); //  funçao para elevar um numero 
		System.out.println("O terceiro elevado ao cubo é: " + resultado3);
		
		
		
		
		
		
		
		
		
		

	}

}
