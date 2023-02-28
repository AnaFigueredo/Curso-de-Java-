package com.anafigueredo.cursojava.aula11;

public class CuriosidadeInteiros {

	public static void main(String[] args) {
		 
		
		int var1 = 2147483647; // valor máximo de um nº inteiro
		 
		int var2 = 5; // para não estourar o número máximo de inteiro, o programa irá fazer o seguinte calculo 2147483647 + 1 = 2147483648 depois  2147483648 - 4 = - 2147483644 
		
		System.out.println(var1 + var2);
		
		
	}

}
