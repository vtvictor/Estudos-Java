package br.edu.ifs.fundamento.Exercicio5;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int ano, cont_novo = 0, cont_carro=0, cont=0;
		double velocidade = 0, cont_rapido = 0;
		char resposta='s';
		
		do {
			System.out.println("Informe o ano do carro: ");
			ano=entrada.nextInt();
			
			System.out.println("Informe a velocidade: ");
			velocidade=entrada.nextDouble();
			
			if (cont==0) {
				cont_novo=ano;
				cont_rapido = velocidade;
			}
			
			if (ano>cont_novo) {
				cont_novo = ano;
			}
			
			if(velocidade>cont_rapido) {
				cont_rapido = velocidade;
			}
			
			cont++;
			cont_carro++;
			
			System.out.println("Deseja continuar? S para continuar ou N/n para sair: ");
			resposta=entrada.next().charAt(0);

				
		}while ((resposta!='n') || (resposta!='N'));
		
		System.out.println("Quantidade de carros: "+cont_carro);
		System.out.println("O ano do carro mais novo: "+cont_novo);
		System.out.println("Velocidade do mais rápido: "+cont_rapido+"km/h");

	}

}
