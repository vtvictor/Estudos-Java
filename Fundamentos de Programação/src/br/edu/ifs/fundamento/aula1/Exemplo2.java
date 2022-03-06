package br.edu.ifs.fundamento.aula1;

import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int km, dias;
		double dias_final, km_final, total;
		
		
		System.out.println("Quantos dias ficou com o carro: ");
		dias=entrada.nextInt();
		
		System.out.println("Quantos quilômetros rodou: ");
		km=entrada.nextInt();
		
		dias_final= dias*30;
		km_final=km*0.01;
		total= dias_final + km_final;
		total= total - (total*0.10);
		
		System.out.println("Valor que o cliente vai pagar com 10% de desconto: R$"+total);
		
		
	}

}
