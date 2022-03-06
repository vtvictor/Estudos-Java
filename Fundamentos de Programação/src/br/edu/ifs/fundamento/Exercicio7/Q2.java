package br.edu.ifs.fundamento.Exercicio7;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner (System.in);
		int vetor1[]= new int [5];
		int maior = 0, maior_valor, menor = 0, menor_valor, teste, i, posicao_maior = 0, posicao_menor = 0, k;
		
		for (i=0; i<vetor1.length;i++){
			System.out.println("Digite um número para armazenar no vetor: ");
			vetor1[i]=entrada.nextInt();
		}
		menor=vetor1[0];
		maior=vetor1[0];
		for(i = 0; i<vetor1.length;i++) {
			for(i=0; i<vetor1.length;i++) {
				if (vetor1[i]>=maior){
					maior=vetor1[i];
					maior_valor=maior;
					posicao_maior=i;
				}
				if (vetor1[i]<=menor) {
					menor=vetor1[i];
					menor_valor=menor;
					posicao_menor=i;
				}
			}
		}
		System.out.println("Maior valor: "+maior+" na posição: "+posicao_maior);
		System.out.println("Menor valor: "+menor+" na posição: "+posicao_menor);	
	}

}
