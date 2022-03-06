package br.edu.ifs.fundamento.Exercicio2;

import java.util.Scanner;

public class Q3 {
	public static void main (String[]args) {
		/*Para os devidos testes, lembre-se que o tamanho da
escada digitado deve ser maior que a altura que se deseja alcançar. 
formula para calcular hipotenusa: a²= b² + c²*/
		
		
		Scanner entrada = new Scanner (System.in);
		
		double altescada, altquadro;
		double hipotenusa;
		
		System.out.println("Informe o tamanho da escada(deve ser maior que a altura desejada): ");
		altescada=entrada.nextInt();
		
		System.out.println("Informe a altura que deseja pregar o quadro: ");
		altquadro=entrada.nextInt();
		
		hipotenusa= Math.hypot(altquadro, altescada);
			
		System.out.println("Distancia necessária: "+hipotenusa);
	}

}
