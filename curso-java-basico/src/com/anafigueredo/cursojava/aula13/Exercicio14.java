package com.anafigueredo.cursojava.aula13;

import java.util.Scanner;

/* João Papo-de-Pescador, homem de bem, comprou um 
microcomputador para controlar o rendimento diário de seu trabalho. 
Toda vez que ele traz um peso de peixes maior que o estabelecido 
pelo regulamento de pesca do estado de São Paulo (50 quilos) deve 
pagar uma multa de R$ 4,00 por quilo excedente. João precisa que 
você faça um programa que leia a variável peso (peso de peixes) e 
verifique se há excesso. Se houver, gravar na variável excesso e na 
variável multa o valor da multa que João deverá pagar. Caso contrário 
mostrar tais variáveis com o conteúdo ZERO */



public class Exercicio14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		double variavelExcesso;
		double multaExcesso = 4.00;
		double peso; 
		double multa = 0.0d;

		
		System.out.println(" Digite o peso:");
		peso = scan.nextDouble(); 
		
		if (peso <= 50) {
			variavelExcesso = 0; 
			multa = 0;
			System.out.println("O peso atual:" + peso);
			System.out.println("Multa a pagar:" + multa);
			
		} else {
			variavelExcesso = peso - 50; 
			multaExcesso =  (variavelExcesso * 4.00);
						
			System.out.println("O peso esperado:" + peso);
			System.out.println("O peso a mais:" + variavelExcesso);
			System.out.println("Multa a pagar:" + multaExcesso);

		   }

		}
}
