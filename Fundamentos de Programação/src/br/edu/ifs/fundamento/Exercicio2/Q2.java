package br.edu.ifs.fundamento.Exercicio2;

import java.util.Scanner;

public class Q2 {
	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);
		
		float largura, comprimento, area, pot;
		
		System.out.println("Informe a largura e comprimento(em cent�metros): ");
		largura=entrada.nextFloat();
		comprimento=entrada.nextFloat();
		
		area = ((largura*comprimento)/10000);
		pot = area*18;
		
		System.out.println("Uma �rea de "+area+"m� � preciso de "+pot+" watts");
		
	}

}
