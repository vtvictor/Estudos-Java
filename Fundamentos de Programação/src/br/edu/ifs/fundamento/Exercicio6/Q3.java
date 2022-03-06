package br.edu.ifs.fundamento.Exercicio6;
import java.util.Scanner;

public class Q3 {
	/* 1/((n*1)*((n*1)+2)) */

	public static void main(String[] args) {
		Scanner entrada= new Scanner (System.in);
		int n=0;
		float x = 0, i=0, j=0;
		
		System.out.println("Informe o o valor limite: ");
		n=entrada.nextInt();
		
		for (i=1;i<=n;i++) {
			x+=(1/((i*1)*(i*1+2)));			
		}
		System.out.println("Somatorio final: "+x);

	}

}
