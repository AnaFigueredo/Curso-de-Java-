package com.anafigueredo.cursojava.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner (System.in);
		
	/*	System.out.println(" Digite a sua idade:");
		int idade = scan.nextInt();
		
		if (idade >= 18) {   // bloco para maior de idade
			System.out.println("Maior de idade");
			
		} else {            // bloco para menor de idade
			System.out.println("Não é maior de idade");

		} */
		
		
		// Condições para o código que vem logo abaixo
		// barato <= 10
		// 10 < valor < 15 ==> pedir desconto
		// 15  <= valor ==> pesquisar mais
		// >= 17 ==> muito caro
		
		System.out.println("Digite o valor do produto:");
		double valor = scan.nextDouble();
		if (valor <= 10) {
			
			System.out.println("Está barato, pode comprar");
			
		} else if (valor > 10 && valor <15){
			System.out.println("Você pode pedir um desconto");
				
		} else if (valor >= 15 && valor < 17 ) { 
			System.out.println("Pode pesquisar mais");

		}else {  // valor >= 17
			System.out.println("Está muito caro");

		}
		
		
	}

}
