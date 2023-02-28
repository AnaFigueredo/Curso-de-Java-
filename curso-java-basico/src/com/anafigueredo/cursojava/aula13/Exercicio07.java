package com.anafigueredo.cursojava.aula13;

import java.util.Scanner;

/* 7. Faça um Programa que calcule a área de um quadrado, em seguida 
mostre o dobro desta área para o usuário.*/

public class Exercicio07 {

	public static void main(String[] args) {
			

     Scanner scan = new Scanner (System.in);
     System.out.println(" Digite o valor do quadrado:");
     int valorQuadrado = scan.nextInt();
     double areaQuadrado = (valorQuadrado * valorQuadrado);
     double dobroArea = (areaQuadrado * 2); 
     System.out.println(" O dobro da área é igual a: " + dobroArea + " cm ");
     
     
		
	}

}
