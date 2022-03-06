package Prova;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int janela[] = new int [24]; 
		int corredor[] = new int [24];
		int x = 1, opcao, cont=0;
		String lugar;
		int num;
		
		for (int i=1;i<24;i++) {
			janela[i]=0;
			corredor[i]=0;
		}
		
		do {
			System.out.println("Menu: ");
			System.out.println("1- Vender passagens do ônibus;");
			System.out.println("2- Encerrar o programa.");
			System.out.println("Informe a opção desejada: ");
			opcao=entrada.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("Deseja sentar na janela ou no corredor(Digite janela ou corredor)?");
				lugar = entrada.next().toLowerCase();
				if(lugar.equalsIgnoreCase("janela")){
					System.out.println("Informe o número da cadeira (1 à 24):");
					num=entrada.nextInt();
					num = num-1; /*subtrai sempre o número por -1 para não ter problema caso a pessoa escolha a poltrona 24*/		
					if (janela[num]==0) {
						janela[num]=num;
						cont++;
					}else {
						System.out.println("Local ocupado!");
					}
				} else {
					if(lugar.equalsIgnoreCase("corredor")){
						System.out.println("Informe o número da cadeira (1 à 24):");
						num=entrada.nextInt();
						num=num-1;/*subtrai sempre o número por -1 para não ter problema caso a pessoa escolha a poltrona 24*/
						
						if (corredor[num]==0) {
							corredor[num]=num;
							cont++;
						}else {
							System.out.println("Local ocupado!");
						}	
					}
				}
				
				break;
			case 2:
				System.out.println("Programa encerrado!");
				break;
			default:
				System.out.println("Opção invalida!");
			}
			
		} while(opcao!=2);
		
		System.out.println("Número de poltronas ocupada: "+cont);
	}
}
