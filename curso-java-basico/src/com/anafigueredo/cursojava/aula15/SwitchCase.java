package com.anafigueredo.cursojava.aula15;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		
		Scanner scan  = new Scanner (System.in);
		
		System.out.println("Digite um número inteiro de 1 à 7, referente ao dia da semana:");
		int diaSemana = scan.nextInt();
		
		if (diaSemana == 1) {			
			System.out.println("Domingo");
		}else if (diaSemana == 2){
			System.out.println("Segunda");
		} else if (diaSemana == 3){
			System.out.println("Terça-feira");
		}else if (diaSemana == 4){
			System.out.println("Quarta-feira");
		}else if (diaSemana == 5){
			System.out.println("Quinta-feira");
		} else if (diaSemana == 6){
			System.out.println("Sexta-Feira");
		}else if (diaSemana == 7){
		    System.out.println("Sábado");
		} else {
		    System.out.println("Por favor, digite um número inteiro válido de 1 à 7");			

	   } 
		/*	
		
		switch (diaSemana) {
		case 1: System.out.println("Domingo");break;  // o break é como se fosse o fechamento da chave {}
		case 2: System.out.println("Segunda");break;
		case 3: System.out.println("Terça-feira");break;
		case 4:	System.out.println("Quarta-feira");break;
		case 5: System.out.println("Quinta-feira");break;
		case 6: System.out.println("Sexta-Feira");break;
		case 7: System.out.println("Sábado");break;
		default: System.out.println("Por favor, digite um número inteiro válido de 1 à 7");

		} */
	
		// exemplo 3: sem o break. O código inteiro é executado até que se ache um break para parar.
		
	/*
		switch (diaSemana) {
		case 1: System.out.println("Domingo");  // o break é como se fosse o fechamento da chave {}
		case 2: System.out.println("Segunda");
		case 3: System.out.println("Terça-feira");
		case 4:	System.out.println("Quarta-feira");
		case 5: System.out.println("Quinta-feira");
		case 6: System.out.println("Sexta-Feira");
		case 7: System.out.println("Sábado");break; // Sem o break tudo o que vem antes é mostrado. O código só tem fim no break {}
		default: System.out.println("Por favor, digite um número inteiro válido de 1 à 7");
      }
      
      */


		// exemplo 4:
		
		
	switch (diaSemana) {
	case 2: 
	case 3:  
	case 4:	
	case 5: 
	case 6: System.out.println("Dia útil");break;
	case 1:
	case 7: System.out.println("Final de semana");break; // Sem o break tudo o que vem antes é mostrado. O código só tem fim no break {}
	default: System.out.println("Por favor, digite um número inteiro válido de 1 à 7");

	
	
	}

  } 

}

					
				

		
			

			
		
		
	


