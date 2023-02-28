package com.anafigueredo.cursojava.aula13;


import java.util.Scanner;

/*  Faça um programa para uma loja de tintas. O programa deverá pedir o
tamanho em metros quadrados da área a ser pintada. Considere que a
cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a
tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao
usuário a quantidades de latas de tinta a serem compradas e o preço
total. 
 */

public class Exer16 {

	public static void main(String[] args) {
		
		
		 Scanner scan = new Scanner (System.in);
		 System.out.println(" Informe o tamanho em metros quadrados da área a ser pintada:");
		 double metros = scan.nextDouble();
		 double litros = metros / 3; 
		 double precoTinta = 80; 
		 int capacidadelata = 18; 
		 double qtdLatas = Math.ceil(litros / capacidadelata); // math.ceil sempre arredonda para cima, pois não podemos comprar meia lata, somente latas inteiras.
		 double precoTotal =  precoTinta * qtdLatas; 
		 System.out.println(" A quantidade de tinta a ser comprada é:" + qtdLatas);
		 System.out.println(" O preço total é:" + precoTotal);
		 

		 
		 
		 

	}

}
