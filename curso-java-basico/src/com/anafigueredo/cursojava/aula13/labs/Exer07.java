package com.anafigueredo.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		
		
		 Scanner scan = new Scanner (System.in);
		 
		 System.out.println(" Informe o lado do quadrado:");
		 double lado = scan.nextDouble();
		
		 // area = lado * lado		
		 double area = Math.pow(lado, 2); 
		 System.out.println(" A área do quadrado é:" + area);
		 double areaDobro = area * 2; 
		 System.out.println(" O dobro da área é:" + areaDobro);

			

	}

}
