package br.edu.ifs.fundamento.Exercicio3;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float indice;
		
		System.out.println("Informe o indice de polui��o: ");
		indice=entrada.nextFloat();
		
		/*>=0.44 pq estava dando erro se colocasse 0.45*/
		if (indice>=0.44) {
			System.out.println("As ind�strias do grupo 1 precisam susperderem suas atividades.");
			System.out.println("As industrias do grupo 2 precisam susperderem suas atividades.");
		} else {
			if (indice>0.25) {
				System.out.println("As ind�strias do grupo 1 precisam susperderem suas atividades.");
				System.out.println("As industrias do grupo 2 n�o precisam susperderem suas atividades.");
			} else {
				System.out.println("�ndice de polui��o aceitavel.");
			}
		}
	}

}
