package br.edu.ifs.fundamento.Exercicio5;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		float CRE, CRE_menor = 0, cont=0, CRE_medio=0, cont_aluno;
		String matricula =null, matricula_menor = null;
		
		System.out.println("Digite a matrícula (999 para sair): ");
		matricula=entrada.next();
				
		while (matricula.equalsIgnoreCase("999")==false) {
			System.out.println("Digite o CRE: ");
			CRE=entrada.nextFloat();
			
			if(cont==0) 
				CRE_menor=CRE;		
			
			if (CRE<CRE_menor)  
				matricula_menor=matricula;
				
			CRE_medio+=CRE;
						
			cont++;
			
		System.out.println("Digite a matrícula (999 para sair): ");
		matricula=entrada.next();
		System.out.println("Teste: "+matricula);
		}
		
		CRE_medio=CRE_medio/cont;
		
		System.out.println("Matrícula do aluno com menor CRE: "+matricula_menor);
		System.out.println("CRE médio de todos os candidatos: "+CRE_medio);

	}

}
