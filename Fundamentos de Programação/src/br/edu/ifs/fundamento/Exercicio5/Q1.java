package br.edu.ifs.fundamento.Exercicio5;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		double valor, valor_desconto, valor_teste;
		int cont=0;
		
			System.out.println("Informe o preço original (digite 0 para sair): ");
			valor=entrada.nextFloat();
			
			while(valor!=0) {
				System.out.println("Informe o preço com desconto: ");
				valor_desconto=entrada.nextFloat();
				
				valor_teste = valor - (valor*0.20);
				
				if (valor_desconto<=valor_teste) 
					cont++;
				
				System.out.println("Informe o preço original (digite 0 para sair): ");
				valor=entrada.nextFloat();
				
			}
		
		System.out.println("Quantidade de produtos que tiveram abatimentno de pelo menos 20%: "+cont);
		

	}

}
