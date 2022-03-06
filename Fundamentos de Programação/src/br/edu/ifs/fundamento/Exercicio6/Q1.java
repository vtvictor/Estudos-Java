package br.edu.ifs.fundamento.Exercicio6;
import java.util.Scanner;

public class Q1 {
	public static void main (String[]args) {
		Scanner entrada = new Scanner (System.in);
		
		float valor_vendas, valor_bonus, valor_mes, salario, bonus; 
		int qtd_jogos;
		
		System.out.println("Informe a quantidade de jogos vendidos esse mês: ");
		qtd_jogos=entrada.nextInt();
		
		valor_vendas = (float) (qtd_jogos * 19.90);
		
		salario = (float) (valor_vendas * 0.50);
		
		bonus = (float) (valor_vendas*0.08);
		
		int calculo = qtd_jogos/15;
		
		valor_bonus = calculo*bonus;
		
		salario = salario + (calculo*bonus);
		
		System.out.println("Valor total arrecadado em vendas: R$ "+valor_vendas);
		System.out.println("Valor ganho como bônus: R$ "+valor_bonus);
		System.out.println("Valor total que Catarina receberá no mês: R$ "+salario);
		
		
	}

}
