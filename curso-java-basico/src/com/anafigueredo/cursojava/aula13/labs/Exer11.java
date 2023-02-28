package com.anafigueredo.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		
			
		Scanner scan = new Scanner (System.in);

		 System.out.println(" Informe um número inteiro:");
		 int numero1  = scan.nextInt();
		 System.out.println(" Informe outro número inteiro:");
		 int numero2  = scan.nextInt();
		 System.out.println(" Informe um número real:");
		 double numero3  = scan.nextDouble();
		 int resultado1 = (numero1 * 2) * ( numero2/2);    // o produto do dobro do primeiro com metade do segundo
		 double resultado2 = ( (numero1 * 3) + numero3);   // a soma do triplo do primeiro com o terceiro.
		 double resultado3 = Math.pow(numero3, 3);         //o terceiro elevado ao cubo.
		 
		 		 
		 
		 System.out.println("O produto do dobro do primeiro com metade do segundo é: " + resultado1 );
		 System.out.println("A soma do triplo do primeiro com o terceiro é: " + resultado2 );
		 System.out.println("O terceiro elevado ao cubo é: " + resultado3 );

		
	}

}
