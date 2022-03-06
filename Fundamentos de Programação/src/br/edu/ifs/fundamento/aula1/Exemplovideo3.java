package br.edu.ifs.fundamento.aula1;

import java.util.Scanner;

public class Exemplovideo3 {

	public static void main(String[] args) {
		/*Formula para transformar de C para F F=(9*C+160/)5 */
		
		Scanner entrada=new Scanner(System.in);
		
		double temperatura;
		
		System.out.println("Informe a temperatura em Celsius: ");
		temperatura=entrada.nextDouble();
		
		temperatura=(9*temperatura+160)/5;
		
		System.out.println("Em Fahreheit: "+temperatura);


	}

}
