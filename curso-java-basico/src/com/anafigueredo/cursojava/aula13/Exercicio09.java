package com.anafigueredo.cursojava.aula13;

import java.util.Scanner;

/* Faça um Programa que peça a temperatura em graus Farenheit, 
transforme e mostre a temperatura em graus Celsius.
o C = (5 * (F-32) / 9)8 */

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe a temperatura em Farenheit:");
		double tempFarenheit = scan.nextDouble();
		double tempCelsius = (5 * (tempFarenheit-32) / 9); 
		
		System.out.println(" a temperatura em graus Celsius:" + tempCelsius + " °C");
		
		
	}

}
