package br.edu.ifs.fundamento.aula1;

import java.util.Scanner;


public class Exemplo3 {
	public static void main (String[]args) {
		Scanner entrada = new Scanner (System.in);
			
		int dist_inicial, dist_final, velo_kmh, dist_total;
		float tempo_medio, velo_ms;
		
		System.out.println("Informe a distância inicial: ");
		dist_inicial=entrada.nextInt();
		
		System.out.println("Informe a distância final: ");
		dist_final=entrada.nextInt();
		
		System.out.println("Informe a velocidade(km/h)");
		velo_kmh=entrada.nextInt();
		
		dist_total=dist_final - dist_inicial;
		System.out.println("teste: "+dist_total);
		tempo_medio=dist_total/velo_kmh;
		velo_ms= (velo_kmh*1000)/3600;
		System.out.println("Tempo médio para chegar ao local: "+tempo_medio+"h");
		System.out.println("Velocidade em metros/segundos: "+velo_ms+ "m/s");
		
	}
	

}
