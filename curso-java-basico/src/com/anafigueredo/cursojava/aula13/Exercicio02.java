package com.anafigueredo.cursojava.aula13;

import java.util.Scanner;

/* 2. Faça um Programa que peça um número e então mostre a 
mensagem O número informado foi [número]*/

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Informe um número:");
		int numeroDigitado = scan.nextInt(); 
		System.out.println("O número didgitado foi:" + numeroDigitado);


	}

}
