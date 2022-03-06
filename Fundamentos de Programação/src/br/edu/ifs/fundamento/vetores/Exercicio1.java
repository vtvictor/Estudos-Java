package br.edu.ifs.fundamento.vetores;

import java.util.Scanner;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		int numeros[]=new int[3];
		
		int i;
		
		for (i=0;i<numeros.length;i++) {
			System.out.println("Digite um número inteiro: ");
			numeros[i]=entrada.nextInt();
			
		}
		
		for (i=0;i<numeros.length;i++) {
			if(numeros[i]%2==0)
				System.out.println("Números ["+i+"]= " +numeros[i]+ " é par!" );
		}

	}

}
