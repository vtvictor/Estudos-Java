package Clinica_Refazendo;

import java.util.Scanner;

public class Programa_Principal {

	public static void main(String[] args) {
		Scanner dados = new Scanner (System.in);
		Estabelecimento e = new Estabelecimento("Clinica Viver Bem", "Rua Teste A, 19");
		int opcao = 0;
		int crn;
		double valorConsulta;
		int codigo;
		String nome;
		
		
		do {
			System.out.println("Menu: ");
			System.out.println("1. Contratar Nutricionista");
			System.out.println("2. Marcar Consulta");
			System.out.println("3. Pagar Consulta");
			System.out.println("4. Sair do Sistema");
			System.out.println("Informe a opção desejada: ");
			opcao=dados.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.println("Digite o CRN do nutricionista: ");
				crn=dados.nextInt();
				
				System.out.println("Digite o nome do nutricionista: ");
				nome=dados.next();
				
				System.out.println("Digite o valor da consulta do nutricionista: ");
				valorConsulta=dados.nextInt();
				Nutricionista nutri = new Nutricionista (crn, nome, valorConsulta);
				e.contratarNutri(nutri);
				break;
				
			case 2:
				System.out.println("Digite o CRN do nutricionista: ");
				crn=dados.nextInt();
				Nutricionista nutri2 = e.buscarNutri(crn);
				
				if(nutri2!=null) {
					System.out.println("Consulta marcada, código da consulta: "+e.marcarConsulta(nutri2));
					
				}else {
					System.out.println("Nutricionista não encontrado!");
				}
				break;
			case 3:
				System.out.println("Digite o código da consulta: ");
				codigo=dados.nextInt();
				valorConsulta=e.pagarConsulta(codigo);
				break;
				
			case 4:
				
				System.out.println("Fim do programa.");
				break;					
			}
			
		}while (opcao!=4);
	}

}
