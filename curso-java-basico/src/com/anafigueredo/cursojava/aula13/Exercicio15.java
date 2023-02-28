package com.anafigueredo.cursojava.aula13;

import java.util.Scanner;

/* 5.Faça um Programa que pergunte quanto você ganha por hora e o 
número de horas trabalhadas no mês. Calcule e mostre o total do seu 
salário no referido mês, sabendo-se que são descontados 11% para o 
Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um 
programa que nos dê:
. salário bruto.
a. quanto pagou ao INSS.
b. quanto pagou ao sindicato.
c. o salário líquido.
d. calcule os descontos e o salário líquido, conforme a tabela abaixo:
+ Salário Bruto : R$ - IR (11%) : R$ - INSS  (8%) : R$ - Sindicato ( 5%) : R$ =
 Salário Liquido : R$ Obs.: Salário Bruto - Descontos = Salário Líquido */ 

public class Exercicio15 {

	public static void main(String[] args) {

    Scanner scan = new Scanner (System.in); 

   
    
    System.out.println("Digite quanto você ganha por hora: ");
    double valorHora = scan.nextDouble();
    System.out.println("Digite o número de horas trabalhadas no mês: ");
    double qtdHorasTrabalhadas = scan.nextDouble();
    double salarioBruto =  (valorHora * qtdHorasTrabalhadas); 
    
    // descontos
    double descontoINSS = (salarioBruto * 0.08 );            // 8% desconto
    double descontoIR =  (salarioBruto * 0.11);                // 11% desconto 
    double descontoSindicato = (salarioBruto * 0.05);           // 5 % desconto
    double totalDescontos = (descontoINSS + descontoIR + descontoSindicato);
    
    double salarioLiquido = (salarioBruto - totalDescontos);   
    System.out.println("Sálario Bruto: " + salarioBruto);
    System.out.println("Valor pago ao INSS: " + descontoINSS);
    System.out.println("Valor pago ao IR: " + descontoIR);
    System.out.println("Valor pago ao Sindicato: " + descontoSindicato);
    System.out.println("Sálario líquido: " + salarioLiquido);

       
    
	}

}
