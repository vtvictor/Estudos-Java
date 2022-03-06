package br.edu.ifs.fundamento.aula1;

import java.util.Scanner;

public class Exemploimc {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		float peso, altura;
		double imc;
		
		System.out.println("Informe a altura: ");
		altura=entrada.nextFloat();
		
		System.out.print("Informe o peso: ");
		peso=entrada.nextFloat();
		
		imc=peso/(Math.pow(altura, 2));
		
		System.out.println("IMC: "+imc);
		

	}

}
