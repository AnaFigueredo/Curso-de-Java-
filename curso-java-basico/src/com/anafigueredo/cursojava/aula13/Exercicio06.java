package com.anafigueredo.cursojava.aula13;
/* 6. Faça um Programa que peça o raio de um círculo, calcule e mostre 
sua área.*/

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {


		Scanner scan =  new Scanner (System.in);
		
		System.out.println(" Informe o valor do raio:");
		double raioCirculo = scan.nextDouble();
	    double areaCirculo = ( 3.14 * (raioCirculo* raioCirculo)) ; 
		System.out.println(" A área do circulo é: " + areaCirculo);
	
	
	}

}
