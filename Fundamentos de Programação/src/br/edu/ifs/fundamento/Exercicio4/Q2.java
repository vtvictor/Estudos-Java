package br.edu.ifs.fundamento.Exercicio4;
import java.util.Scanner;
public class Q2 {
	
	/* Os alunos do laboratório de robótica precisam de camisas para participar de uma
competição. Cada um quer uma camisa diferente e o professor da área resolveu fazer um sistema
para determinar como será a camisa. Os alunos ficaram responsáveis por trazer algumas cotações e
alguns fatores influenciarão a escolha. */

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		String cor;
		char tipo_camiseta;
		double valor;
		
		System.out.println("Informe a cor da camiseta(preto, marrom, azul, verde, branca, amarela, rosa): ");
		cor=entrada.nextLine();
		System.out.println("Informe se é com bordada ou serigrafia: ");
		tipo_camiseta=entrada.next().charAt(0);
		System.out.println("Informe o preço da camiseta: ");
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
						System.out.println("Analisar em último caso");
					}
				}	
			}
		} else {
			System.out.println("Não é aceito nenhuma cotação com preço maior que R$ 45,00");
		}
}
}
