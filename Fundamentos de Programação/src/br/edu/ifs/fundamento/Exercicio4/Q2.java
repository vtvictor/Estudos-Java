package br.edu.ifs.fundamento.Exercicio4;
import java.util.Scanner;
public class Q2 {
	
	/* Os alunos do laborat�rio de rob�tica precisam de camisas para participar de uma
competi��o. Cada um quer uma camisa diferente e o professor da �rea resolveu fazer um sistema
para determinar como ser� a camisa. Os alunos ficaram respons�veis por trazer algumas cota��es e
alguns fatores influenciar�o a escolha. */

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		String cor;
		char tipo_camiseta;
		double valor;
		
		System.out.println("Informe a cor da camiseta(preto, marrom, azul, verde, branca, amarela, rosa): ");
		cor=entrada.nextLine();
		System.out.println("Informe se � com bordada ou serigrafia: ");
		tipo_camiseta=entrada.next().charAt(0);
		System.out.println("Informe o pre�o da camiseta: ");
		valor=entrada.nextDouble();
		
		if (valor<45) {
			if (cor.equalsIgnoreCase("preto") | cor.equalsIgnoreCase("marrom") | cor.equalsIgnoreCase("azul") | cor.equalsIgnoreCase("verde")){
				System.out.println(cor);
				if((tipo_camiseta=='b') & (valor<=35)){
					System.out.println(tipo_camiseta);
					System.out.println("Atende aos requisitos do professor!");
				}
			}else {
				if (cor.equalsIgnoreCase("branca") | cor.equalsIgnoreCase("amarela") | cor.equalsIgnoreCase("rosa")){
					if(valor<=35) {
						System.out.println("Atende aos requisitos do professor!");
					} else {
						System.out.println("Analisar em �ltimo caso");
					}
				}	
			}
		} else {
			System.out.println("N�o � aceito nenhuma cota��o com pre�o maior que R$ 45,00");
		}
}
}
