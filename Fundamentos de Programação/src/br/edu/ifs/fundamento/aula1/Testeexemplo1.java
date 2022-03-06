package br.edu.ifs.fundamento.aula1;

import java.util.Scanner;

public class Testeexemplo1 {

	public static void main(String[] args) {
		/*calculo da media de notas */
		
		Scanner entrada = new Scanner (System.in);
		
		double nota1, nota2, nota3;
		double media;
		String nome;
		
		
		System.out.println("Digite o nome do aluno: ");
		nome=entrada.next();
		System.out.println("Informe a primeira nota: ");
		nota1=entrada.nextDouble();
		System.out.println("Informe a segunda nota: ");
		nota2=entrada.nextDouble();
		System.out.println("Informe a terceira nota: ");
		nota3=entrada.nextDouble();
		
		media=(nota1+nota2+nota3)/3;
		
		System.out.println("Nome do aluno: "+nome+ " obteve media: "+media);
		
		
		
		
		
		
		
		

	}

}
