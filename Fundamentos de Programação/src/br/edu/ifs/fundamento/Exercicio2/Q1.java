package br.edu.ifs.fundamento.Exercicio2;

import java.util.Scanner;

public class Q1 {
	public static void main (String[]args) {
		Scanner entrada = new Scanner (System.in);
		
		int N, C, D, U, resto, numini, numfim;
		
		System.out.println("Informe um número de três algarismos: ");
		N=entrada.nextInt();
		numini=N;
		
		C= N/100;
		resto= N%100;
		D= resto/10;
		U= resto%10;
		
		numfim= U*100+D*10+C;
		
		System.out.println("N=" +numini+ " e M=" +numfim);		
	}

}
