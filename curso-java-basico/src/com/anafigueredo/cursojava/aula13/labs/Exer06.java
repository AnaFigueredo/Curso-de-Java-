package com.anafigueredo.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		
		
 Scanner scan = new Scanner (System.in);
		
		System.out.println(" Informe o raio do circulo:");
		double raio = scan.nextDouble();
		double area = Math.PI * Math.pow(raio, 2); // uso de classes utilitarias 
		
		System.out.println(" A área do circo é: " + area);

	}

}
