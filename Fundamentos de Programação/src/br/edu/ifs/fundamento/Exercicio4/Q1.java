package br.edu.ifs.fundamento.Exercicio4;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int horaini, horafinal, minini, minfinal, segini, segfinal;
		int hora, min, seg;
		int opcao, resto;
		
		System.out.println("Informe o horário inicial da ocorrência");
		System.out.println("Informe a hora inicial: ");
		horaini=entrada.nextInt();
		System.out.println("Informe os minutos iniciais: ");
		minini=entrada.nextInt();
		System.out.println("Informe os segundos iniciais: ");
		segini=entrada.nextInt();
		
		System.out.println(" ");
		
		System.out.println("Informe o horário final da ocorrência");
		System.out.println("Informe a hora inicial final: ");
		horafinal=entrada.nextInt();
		System.out.println("Informe os minutos finais: ");
		minfinal=entrada.nextInt();
		System.out.println("Informe os segundos finais: ");
		segfinal=entrada.nextInt();
		
		System.out.println(" ");
		hora= horafinal-horaini;
		if (hora<0) {
			hora = hora * -1;
		}
		min= minfinal-minini;
		if (min<0) {
			min = min * -1;
		}
		seg= segfinal-segini;
		if (seg<0) {
			seg = seg * -1;
		}
		
		System.out.println("MENU");
		System.out.println("1- Resultado em hora;");
		System.out.println("2- Resultado em minuto;");
		System.out.println("3- Resultado em segundo;");
		opcao=entrada.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("Duração em hora: "+hora+" horas");
			
			break;
		case 2:
			min = min + (hora*60) + (seg/60);
			
			System.out.println("Duração em minutos: "+min+" minutos");
			
			break;
		case 3:
			seg = seg + (hora*3600) + (min*60);
			System.out.println("Duração em minutos: "+seg+" segundos");
			
			break;
		
		default:
			System.out.println("Opção invalida!");	
		}		
	}
}
