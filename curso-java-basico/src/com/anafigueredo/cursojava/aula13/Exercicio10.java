package com.anafigueredo.cursojava.aula13;

import java.util.Scanner;

/* Faça um Programa que peça a temperatura em graus Celsius, 
transforme e mostre em graus Farenheit */ 


public class Exercicio10 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner (System.in);

		System.out.println("Informe a temperatura em graus Celsius");
		double tempCelsius = scan.nextDouble();
		double tempFarenheit = (((tempCelsius * 9 )/5) + 32);
		System.out.println ("A temperatura em Farenheit:" + tempFarenheit);
		
		
		
		
	}

}
