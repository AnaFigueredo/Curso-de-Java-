package com.anafigueredo.cursojava.aula10;

public class Variaveis {

	public static void main(String[] args) {
   
	// Convenção Java	
    int idade = 20;
    String nome = "Ana";                               // string não é um tipo primitivo, e sim uma classe
    String nomeDoMeuCachorro ="Marrom e Titan";                      // Convençao Camel Case
    
    // Declarações de variáveis válidas, mas não recomendadas.
    int _idade; 
    int $idade;
    String ano2023 =  "2023"; 
    
    // Não é convenção Java
    String nome_do_meu_cachorro;
    String NomeDoMeuCachorro;
    String nomeDomeuCachorro;
    
    // Má prática . Sempre dê nome de variáveis que signifiquem alguma coisa
    int a = 10; 
    String b =  "Ana";
       
        
    idade =  36; 
    System.out.println(" Idade = " + idade);
    System.out.println(" Nome = " + nome);
    System.out.println(" Nome dos meus cachorros = " + nomeDoMeuCachorro);
    
    

	}

}
