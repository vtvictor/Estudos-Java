package br.edu.ifs.fundamento.Exercicio7;
import java.util.Random;
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		/*Para testar as temperaturas de forma mais rápida e prática*/
		Random rand = new Random();
		
		int semana1[] = new int[7];
		int semana2[] = new int[7];
		int semana3[] = new int[7];
		int semana4[] = new int[7];
		int semanamax[] = new int[7];
		
		int d, s, t, q, qi, se, sa, i;
		int semana1_teste = 0, semana2_teste=0, semana3_teste=0, semana4_teste=0;
		float temperatura_min, temperatura_max;
		float soma = 0, media, qtd=0;
		String semana_maxima = null;
		
		/*Preencher os vetores com as temperaturas*/
		for (i=0; i<semana1.length;i++) {
			System.out.println("Informe as temperaturas da primeira semana: ");
			semana1[i]=rand.nextInt(50);
			qtd++;
			
		}
		for (i=0; i<semana2.length;i++) {
			System.out.println("Informe as temperaturas da segunda semana: ");
			semana2[i]=rand.nextInt(50);
			qtd++;
		}
		for (i=0; i<semana3.length;i++) {
			System.out.println("Informe as temperaturas da terceira semana: ");
			semana3[i]=rand.nextInt(50);
			qtd++;
		}
		for (i=0; i<semana4.length;i++) {
			System.out.println("Informe as temperaturas da quarta semana: ");
			semana4[i]=rand.nextInt(50);
			qtd++;
		}
		
		temperatura_min=semana1[1];
		temperatura_max=semana1[0];
		
		/*Somatorio para calcular a média*/
		for(i=0;i<semana1.length;i++) {
			soma+=semana1[i];
			for(i=0;i<semana2.length;i++) 
				soma+=semana2[i];
				for(i=0;i<semana3.length;i++)
					soma+=semana3[i];
					for(i=0;i<semana4.length;i++)
						soma+=semana4[i];
		}
		
		media=soma/qtd;
		
		/*Verificar quais semanas possuíram pelo menos 3 dias com temperatura acima da média
do mês*/
		
		for(i=0;i<semana1.length;i++) {
			if (semana1[i]>media) {
				semana1_teste++;
			}
		}
		for(i=0;i<semana2.length;i++) {
			if (semana2[i]>media) {
				semana2_teste++;
			}
		}
		for(i=0;i<semana3.length;i++) {
			if (semana3[i]>media) {
				semana3_teste++;
			}
		}
		for(i=0;i<semana4.length;i++) {
			if (semana4[i]>media) {
				semana4_teste++;
			}
		}
		
		/*Verificar qual a temperatura máxima*/
		for (i=0;i<semana1.length;i++) {
			if (semana1[i]>=temperatura_max) {
				temperatura_max=semana1[i];
				semana_maxima="Semana 1";
			}
			for(i=0;i<semana2.length;i++) {
				if(semana2[i]>=temperatura_max) {
					temperatura_max=semana2[i];
					semana_maxima="Semana 2";
				}
				for(i=0;i<semana3.length;i++) {
					if(semana3[i]>=temperatura_max) {
						temperatura_max=semana3[i];
						semana_maxima="Semana 3";
					}
					for(i=0;i<semana4.length;i++) {
						if(semana4[i]>=temperatura_max) {
							temperatura_max=semana4[i];
							semana_maxima="Semana 4";
						}
					}
				}
			}
		}
		/*Verificar semana com temperatura máxima para fazer o Histograma*/
		switch (semana_maxima) {
		case "Semana 1":
			for (i=0;i<semanamax.length;i++)
				semanamax[i]=semana1[i];
			break;
		case "Semana 2":
			for (i=0;i<semanamax.length;i++)
				semanamax[i]=semana2[i];
			break;
		case "Semana 3":
			for (i=0;i<semanamax.length;i++)
				semanamax[i]=semana3[i];
			break;
		case "Semana 4":
			for (i=0;i<semanamax.length;i++)
				semanamax[i]=semana4[i];
			break;	
		}	
		
		/*Verificar qual a temperatura minima*/
		for (i=0;i<semana1.length;i++) {
			if (semana1[i]<=temperatura_min) 
				temperatura_min=semana1[i];
			for(i=0;i<semana2.length;i++) {
				if(semana2[i]<=temperatura_min) 
					temperatura_min=semana2[i];
				for(i=0;i<semana3.length;i++) {
					if(semana3[i]<=temperatura_min) 
						temperatura_min=semana3[i];
					for(i=0;i<semana4.length;i++) {
						if(semana4[i]<=temperatura_min) 
							temperatura_min=semana4[i];
					}
				}
			}
		}
		
		System.out.println("Semanas que possuíram pelo menos 3 dias com temperatura acima da média\r\n"
				+ "do mês: ");
		if(semana1_teste>=3) {
			System.out.println("Semana 1.");
		}
		if(semana2_teste>=3) {
			System.out.println("Semana 2.");
		}
		if(semana3_teste>=3) {
			System.out.println("Semana 3.");
		}
		if(semana4_teste>=3) {
			System.out.println("Semana 4.");
		}
		System.out.println(" ");
		
		System.out.println("Temperatura máxima: "+temperatura_max+" °C");
		System.out.println("Temperatura mínima: "+temperatura_min+" °C");
		
		System.out.println(" ");
		
		
		//Histograma
		System.out.print("Semana com a temperatura máxima: "+semana_maxima);
		System.out.println("");
		
		System.out.print("D: ");
		d=semanamax[0];
		for(i=0;i<d;i++) {
			System.out.print("*");
		}System.out.println("");
			
		System.out.print("S: ");
		s=semanamax[1];
		for(i=0;i<s;i++) {
			System.out.print("*");
		}
		System.out.println("");
		
		System.out.print("T: ");
		t=semanamax[2];
		for(i=0;i<t;i++) {
			System.out.print("*");
		}
		System.out.println("");
		
		System.out.print("Q: ");
		q=semanamax[3];
		for(i=0;i<q;i++) {
			System.out.print("*");
		}
		System.out.println("");
		
		System.out.print("Q: ");
		qi=semanamax[4];
		for(i=0;i<qi;i++) {
			System.out.print("*");
		}
		System.out.println("");
		
		System.out.print("S: ");
		se=semanamax[5];
		for(i=0;i<se;i++) {
			System.out.print("*");
		}
		System.out.println("");
		
		System.out.print("S: ");
		sa=semanamax[6];
		for(i=0;i<sa;i++) {
			System.out.print("*");
		}		
	}
				
}