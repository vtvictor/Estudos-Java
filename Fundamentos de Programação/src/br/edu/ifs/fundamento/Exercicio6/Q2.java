package br.edu.ifs.fundamento.Exercicio6;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		float media_idade = 0, media_altura=0, aluno_novo = 0, aluno_velho = 0, altura;
		int idade, i,qtd_altura=0, qtd_altura_idade=0;
		
		for (i = 1; i<=4; i++) {
			System.out.println("Informe a idade: ");
			idade=entrada.nextInt();
			
			System.out.println("Informe a altura: ");
			altura=entrada.nextFloat();
			
			if (i==1) {
				aluno_novo = idade;
				aluno_velho = idade;
			}
			
			if (altura<1.70) {
				media_altura+=altura;
				qtd_altura++;
			}
			
			if (idade>20) {
				media_idade+=altura;
				qtd_altura_idade++;	
			}
			
			if (aluno_novo>idade) 
				aluno_novo = idade;
			
			
			if (aluno_velho<idade) 
				aluno_velho = idade;
	
		}
		
		media_altura = media_altura/qtd_altura;
		media_idade=media_idade/qtd_altura_idade;
		
		System.out.println("Idade media dos alunos com menos de 1,70m de altura: "+media_altura);
		System.out.println("A altura média dos alunos com mais de 20 anos: "+media_idade);
		System.out.println("A idade do aluno mais novo: "+aluno_novo+" anos");
		System.out.println("A idade do aluno mais velho: "+aluno_velho+" anos");
	

	}

}
