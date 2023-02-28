package com.anafigueredo.cursojava.aula15.labs14e15;
/* 
Faça um Programa que leia três números e mostre o maior e o menor
deles.
*/
import java.util.Scanner;


public class Exerc07 {

	public static void main(String[] args) {

     Scanner scan = new Scanner (System.in);
     
     
        System.out.println(" Digite um número inteiro:");
		int numero1 = scan.nextInt();
		
		System.out.println(" Digite um segundo número inteiro:");
		int numero2 = scan.nextInt();
		
		System.out.println(" Digite um terceiro número inteiro:");
		int numero3 = scan.nextInt();
		
        // bloco do maior valor
		if (numero1 >= numero2 && numero1 >= numero3) {
			System.out.println(" O maior número é:" + numero1 );			
		}else if (numero2 >= numero1 && numero2 >= numero3)   {
			System.out.println(" O maior número é:" + numero2 );
		} else if(numero3 >= numero1 && numero3 >= numero2) {
			System.out.println(" O maior número é:" + numero3 );
		}
		// bloco do menor valor não pode ter elseif, porque senao o código abaixo não roda
			if (numero1 <= numero2 && numero1 <= numero3) {  // 
			System.out.println(" O menor número é:" + numero1 );			
		}else if (numero2 <= numero1 && numero2 <= numero3)   {
			System.out.println(" O menor número é:" + numero2 );
		} else if(numero3 <= numero1 && numero3 <= numero2) {
			System.out.println(" O menor número é:" + numero3 );	
		
		}
	}

}
