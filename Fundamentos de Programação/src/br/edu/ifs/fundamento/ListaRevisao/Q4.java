package br.edu.ifs.fundamento.ListaRevisao;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		String vetorA[] = new String [30];
		String vetorB[] = new String [40];
		String vetorC[] = new String[30];
		int i, j;
		int qtd = 0;
		String k;
		
		for(i=0;i<vetorA.length;i++) {
			System.out.println("Informe a matricula do aluno da disciplina A: ");
			vetorA[i]=entrada.next();
		}
		
		for(i=0;i<vetorB.length;i++) {
			System.out.println("Informe a matricula do aluno da disciplina B: ");
			vetorB[i]=entrada.next();
		}
		
		for (i=0;i<vetorA.length;i++) {
			for(j=0;j<vetorB.length;j++) {
				if (vetorA[i].equals(vetorB[j])) {
					vetorC[qtd]=vetorA[i];
					qtd++;
				}
			}
		}
		
		
		System.out.println("Matricula dos alunos que estão cursando as disciplinas A e B ao mesmo tempo: ");
		for (i=0;i<vetorC.length;i++) {
			System.out.print(vetorC[i]+" ");
		}

	}

}
