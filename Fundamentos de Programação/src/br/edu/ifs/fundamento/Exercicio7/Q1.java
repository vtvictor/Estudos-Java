package br.edu.ifs.fundamento.Exercicio7;
import java.util.Scanner;

/**
 * { - classe de exemplo.
 */

public class Q1 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner (System.in);
		
		int i, x, cont = 0;
		int vetor1[] = new int[5];
		
		for (i=0; i<vetor1.length ;i++) {
			System.out.println("Informe um número: ");
			vetor1[i]=entrada.nextInt();
		}
		
		System.out.println("Informe um número para verificar quantas vezes o mesmo aparece no vetor: ");
		x=entrada.nextInt();
		
		for (i=0;i<vetor1.length;i++) {
			if (vetor1[i]==x) {
				cont++;
			}
		}
		System.out.println("O número "+x+" apareceu "+cont+" vezes no vetor.");
		

	}

}
