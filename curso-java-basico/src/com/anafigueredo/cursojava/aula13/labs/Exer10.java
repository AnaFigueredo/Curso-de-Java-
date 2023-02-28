package com.anafigueredo.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner (System.in);

		 System.out.println(" Informe a temperatura em Celsius:");
		 double celsius  = scan.nextDouble();
		 double farenheit  = (((celsius * 9 )/5) + 32);
		 System.out.println(" A  temperatura em farenheit:" + farenheit + " F ");


	}

}
