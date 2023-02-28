package com.anafigueredo.cursojava.aula13;

public class CurtoCircuito {

	public static void main(String[] args) {
		
		
		boolean verdadeiro = true;
		boolean falso = false;
		boolean resultado1 = falso & verdadeiro; // (&) aqui ambas as afirmações são analisadas 
		boolean resultado2 = falso && verdadeiro; // (&&) Curto circuito, apenas a primeira afirmação é avaliada. A segunda é ignorada pelo sistema

		System.out.println(resultado1);
		System.out.println(resultado2);

	}

}
