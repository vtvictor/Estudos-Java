package br.edu.ifs.fundamento.Exercicio7;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner (System.in);
		int vetor1[] = new int[10];
		int vetor2[] = new int[10];
		int vetor3[] = new int[20];
		int i, k=0;
		
		for (i=0;i<vetor1.length;i++) {
			System.out.println("Digite um número para preencher o Vetor 1: ");
			vetor1[i]=entrada.nextInt();
		}
		
		for(i=0;i<vetor2.length;i++) {
			System.out.println("Digite um número para preencher o Vetor 2: ");
			vetor2[i]=entrada.nextInt();
		}
		
		for (i=0;i<vetor3.length;i+=2) {
			vetor3[i]=vetor1[k];
			k++;
		}
		k=0;
		for (i=1;i<vetor3.length;i+=2) {
			vetor3[i]=vetor2[k];
			k++;
		}
		
		System.out.print("Vetor 3: ");
		for (i=0;i<vetor3.length;i++) {
			System.out.print(vetor3[i]+"|");
		}
	}
	

}
