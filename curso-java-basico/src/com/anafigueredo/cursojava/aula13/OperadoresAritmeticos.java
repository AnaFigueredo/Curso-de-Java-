package com.anafigueredo.cursojava.aula13;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		
	  int resultado = 1+2;          
	  System.out.println(resultado);
	  
	  resultado = resultado -1;
	  System.out.println(resultado);

	  resultado = resultado * 2;
	  System.out.println(resultado);

	  resultado = resultado / 2;
	  System.out.println(resultado);
	  
	  resultado = resultado + 8; 
	  System.out.println(resultado);
	  
	  resultado = resultado % 7;
	  System.out.println(resultado);
	  
	  // concatenação de Strings
	  String primeiroNome = " Esta é";
	  String segundoNome = " uma String concatenada";
	  String terceiroNome =  primeiroNome + segundoNome;
	  System.out.println(terceiroNome);
	  
	  resultado = resultado + 1; 
	  System.out.println(resultado);
	  
	  resultado ++; 
	  System.out.println(resultado);
	  
	 // resultado é 5	  
	  System.out.println(resultado++); //primeiro imprima o valor do resultado e adicione + 1 a ele;  
	  // Os exemplos abaixo, equivalem a mesma coisa que: 
	  //System.out.println(resultado);
	  //resultado = resultado + 1; // a mesma coisa que o código abaixo  
	  //resultado+= 1;  

	  
	  System.out.println(++resultado); // primeiro adicione o valor a String e depois faça o output;
      // é a mesma coisa que: 
	  // resultado += 1;  
	  // System.out.println(resultado);
	  
	  resultado --;
	  System.out.println(resultado);
	  
	  System.out.println(resultado --); // 6 - 1 = 5
	  System.out.println(-- resultado); // 5- 1 = 4



	  
	  


	    
	}

}
