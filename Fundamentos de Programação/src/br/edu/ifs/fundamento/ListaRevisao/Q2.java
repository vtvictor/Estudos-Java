package br.edu.ifs.fundamento.ListaRevisao;
import java.util.Scanner;

public class Q2 {
/* Calcular a multa: Leia a velocidade de um carro e a velocidade máxima para a rua:
1. Informe 50 reais se estiver até 10km/h acima;
2. Informe 100 reais se estiver entre 11km/h e 30km/h acima;
3. Informe 300 reais se estiver acima de 31km/h acima;*/

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		float velo_carro, velo_max, test = 0;
		
		System.out.println("Informe a velocidade do carro: ");
		velo_carro=entrada.nextFloat();
		System.out.println("Informe a velocidade máxima: ");
		velo_max=entrada.nextFloat();
		
		test= velo_carro - velo_max;
		
		if (test<0) {
			test = test*-1;
		}
		
		if (test<=10) {
			System.out.println("50 reais de multa para pagar!");
		} else {
			if(test >=11 & test<=30) {
				System.out.println("100 reais de multa para pagar!");
			}else {
				System.out.println("300 reais de multa para pagar!");
			}
		}
	}

}
