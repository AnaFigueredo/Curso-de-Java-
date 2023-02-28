package com.anafigueredo.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {

		 Scanner scan = new Scanner (System.in);

		
		 System.out.println(" Informe o tamanho do arquivo:");
		 double tamanhoArquivo = scan.nextDouble();
		 System.out.println(" Informe a velocidade da Internet:");
		 double velocidadeInternet = scan.nextDouble();
		 double tempo  = (tamanhoArquivo / velocidadeInternet); 
		 System.out.println(" O tempo de download é: " + tempo);

		
		
	}

}
