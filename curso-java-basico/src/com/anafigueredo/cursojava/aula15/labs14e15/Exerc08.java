package com.anafigueredo.cursojava.aula15.labs14e15;
/*
 Faça um programa que pergunte o preço de três produtos e informe
qual produto você deve comprar, sabendo que a decisão é sempre
pelo mais barato.
 */


import java.util.Scanner;

public class Exerc08 {

	public static void main(String[] args) {
     Scanner scan =  new Scanner (System.in);
     
     System.out.println(" Informe o preço do primeiro produto:");
     double preco1 = scan.nextDouble();
     System.out.println(" Informe o preço do segundo produto:");
     double preco2 = scan.nextDouble(); 
     System.out.println(" Informe o preço do terceiro produto:");
     double preco3 = scan.nextDouble(); 
     
     
     if (preco1<= preco2 && preco1<= preco3) {
    	 System.out.println(" Pode comprar o produto 1, está barato:" + preco1); 
     }else if (preco2<= preco2 && preco2<= preco3) {
    	 System.out.println(" Pode comprar o produto 2, está barato:" + preco2); 
     }else if (preco3<= preco1 && preco3<= preco2) {
    	 System.out.println(" Pode comprar o produto 3, está barato:" + preco3);  
    	    	 
    	 
     } 
    		 
    		 
    		 
    		 
	}

}
