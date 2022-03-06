package br.edu.ifs.fundamento.Exercicio3;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner (System.in);
		
		int p, total, excesso;
		double valor;
		
		System.out.println("Informe o peso de peixes: ");
		p=entrada.nextInt();
		
		if (p>50) {
			excesso = (p - 50);
			valor=excesso*8;
			System.out.println("Quantidade excedida: "+excesso+" kg");
			System.out.println("Valor da multa: R$ "+valor);
		}else {
			System.out.println("Não houve excesso!");
		}
		

	}

}
