package com.anafigueredo.cursojava.aula15.labs14e15;
/*
 Faça um programa para a leitura de duas notas parciais de um aluno.
O programa deve calcular a média alcançada por aluno e apresentar:
o A mensagem "Aprovado", se a média alcançada for maior ou
igual a sete; 
==> A mensagem "Reprovado", se a média for menor do que sete;
==> A mensagem "Aprovado com Distinção", se a média for igual a
dez.
 */

import java.util.Scanner;

public class Exerc05 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner (System.in);
				
				System.out.println(" Digite a primeira nota:");
				double nota1 = scan.nextDouble();
				System.out.println(" Digite a segunda nota:");
				double nota2 = scan.nextDouble();
				double media = (nota1 + nota2)/ 2; 
				
				if (media == 10) {
					System.out.println("Aprovado com Distinção com média: " + media);
        
				} else if ( media >= 7) {
					System.out.println("Aprovado com média: " + media );
					
				} else if ( media < 7) {
					System.out.println("Reprovado com média: " + media );
						
					
				}				
		}
}
