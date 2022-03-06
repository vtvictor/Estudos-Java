package br.edu.ifs.fundamento.aula1;

import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double produto, valor_final;
		
		System.out.println("Digite o valor do produto: ");
		produto=entrada.nextDouble();
		
		valor_final=produto - (produto*0.09);
		
		System.out.println("Valor final com desconto de 9%: R$"+valor_final);
		
		
		

	}

}
