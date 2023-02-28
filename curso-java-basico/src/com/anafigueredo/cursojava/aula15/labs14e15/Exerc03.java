package com.anafigueredo.cursojava.aula15.labs14e15;

import java.util.Scanner;

/*Faça um Programa que verifique se uma letra digitada é "F" ou "M".
Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido  
 */
public class Exerc03 {

	public static void main(String[] args) {
     
		Scanner scan = new Scanner (System.in);
		
		
		System.out.println(" Digite uma letra (F ou M)");
		String letra = scan.next(); 
		
		if (letra.equalsIgnoreCase("F") ) {  // equalsignorecase serve para comparar Strings e ignora se a letra digitada é maiuscula ou minuscula
			System.out.println(" A letra digitada é F = Feminino");
			
		}else if  (letra.equalsIgnoreCase("M")){
			System.out.println(" A letra digitada é M = Masculino");
		   } else {
			System.out.println("Sexo inválido");

		}
		
	}

}
