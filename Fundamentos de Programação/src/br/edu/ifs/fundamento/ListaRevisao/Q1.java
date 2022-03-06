package br.edu.ifs.fundamento.ListaRevisao;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		/*0 2 1 0 2 1 0 5 1*/
		Scanner entrada = new Scanner (System.in);
		
		for (int i=3; i<20;i+=2) {
			System.out.print((i%3) + " ");
		}
		/*Resposta: 0 2 1 0 2 1 0 5 1*/

	}

}
