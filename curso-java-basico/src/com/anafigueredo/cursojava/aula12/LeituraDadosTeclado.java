package com.anafigueredo.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner (System.in); 
		
		/* System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome completo é: "+ nomeCompleto);
		
        System.out.println("Digite seu primeiro nome: ");
        String primeiroNome = scan.next();  // Se for escrito um nome composto, apenas o primeiro nome será printado no console
        System.out.println(" Seu primeiro nome é: " + primeiroNome);
        
        System.out.println(" Digite a sua idade:");
        int idade = scan.nextInt();
        System.out.println("Sua idade é: "+  idade);
        
        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();
        System.out.println("Sua altura é:" + altura);*/
        
        System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem bichinho de estimação");
        String primeiroNome = scan.next(); // o next lê apenas a primeira informação e não a linha inteira 
        int idade = scan.nextInt();
        byte qtdFilhos = scan.nextByte();
        float altura = scan.nextFloat();
        boolean temPet = scan.nextBoolean(); 
        
        
        System.out.println("Você digitou os seguintes valores:");
        System.out.println("Primeiro nome:" + primeiroNome);
        System.out.println("Idade: " + idade);
        System.out.println("Quantidade de filhos:" +qtdFilhos);
        System.out.println("Altura:" + altura);
        System.out.println("Tem bichinho de estimação? "+ temPet);

        
        
        
        
        
        
	}

}
