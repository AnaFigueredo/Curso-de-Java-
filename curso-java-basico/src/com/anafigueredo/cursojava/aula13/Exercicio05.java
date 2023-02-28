package com.anafigueredo.cursojava.aula13;

import java.util.Scanner;

// 5. Faça um Programa que converta metros para centímetros

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner scan =  new Scanner (System.in);
		
			
		System.out.println(" Informe um valor em metros:");
		int metros = scan.nextInt();
		int centimetros = metros * 100; 
		System.out.println( metros + " metros equivale a: " + " centimentros:" + centimetros + "cm ");
		
		
	}

}
