package com.anafigueredo.cursojava.aula15.labs14e15;

 // Faça um Programa que verifique se uma letra digitada é vogal ou consoante.

import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println(" Digite uma letra:");
		String letra = scan.next();  // next lê a string 
		 
		
		// método usando if/else para determinar se a letra é vogal ou consoante.
		if ( letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || 
			 letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || 
			 letra.equalsIgnoreCase("u")){
		System.out.println(" A letra digitada é uma vogal");
		 }else {
		System.out.println(" A letra digitada é uma consoante");
			  
		}
		
		// Switch case para determinar se a letra é vogal ou consoante.
		/* IMPORTANTE: Na variavel "letra", o switch usa o método "equals" e não 
		 o "equalsignorecase" para comparar o valor digitado. 
		 Sendo assim, é preciso ser bem específico quanto a  letra "a" minúscula ou "A" maiúscula.
		  Ambas devem ser especificadas.
		 */
	
		
		
		
		if (letra.length() > 1) {  // essa linha serve para testar se, o valor de input tem mais de 1 character. Se o usuário digita "aa", o programa apresentará a mensagem desse bloco;  	
			System.out.println ("Não é uma letra válida");
		}else {			
		 switch (letra) {  
		 case "a": 
		 case "e": 
		 case "i": 
		 case "o": 
		 case "u":
		 case "A": 
		 case "E": 
		 case "I": 
		 case "O": 
		 case "U":System.out.println(" A letra digitada é uma vogal");break; 
		 default: System.out.println(" A letra Digitada é uma consoante");break;
		 
		 
		 }
		}
		
		}
	
	}


