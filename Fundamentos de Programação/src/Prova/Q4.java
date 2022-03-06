package Prova;
import java.util.Scanner;
public class Q4 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String escolha1, escolha2;
		int j1, j2;
		
		/*pedra = 0; papel = 1, tesoura = 2*/
		
		System.out.println("Jogador 1, informe a sua jogada(pedra, papel ou tesoura): ");
		escolha1=entrada.next().toLowerCase();
		
		System.out.println("Jogador 2, informe a sua jogada(pedra, papel ou tesoura): ");
		escolha2=entrada.next().toLowerCase();
		
		if (escolha1.equalsIgnoreCase("pedra")) {
			j1=0;
		}else {
			if(escolha1.equalsIgnoreCase("papel")) {
				j1=1;
			}else {
				j1=2;
			}
		}
		if (escolha2.equalsIgnoreCase("pedra")) {
			j2=0;
		}else {
			if(escolha2.equalsIgnoreCase("papel")) {
				j2=1;
			}else {
				j2=2;
			}
		}
		
		if (j1==0 && j2==1) {
			System.out.println("Jogador 1 ganhou!");
			System.out.println("Jogador 2 perdeu!");
		} else {
			if(j1==2 && j2==1) {
				System.out.println("Jogador 1 ganhou!");
				System.out.println("Jogador 2 perdeu!");
			} else {
				if(j1==1 && j2==0) {
					System.out.println("Jogador 1 ganhou!");
					System.out.println("Jogador 2 perdeu!");
				}else {
					if (j2==0 && j1==1) {
						System.out.println("Jogador 2 ganhou!");
						System.out.println("Jogador 1 perdeu!");
					}else {
						if (j2==2 && j1==1) {
							System.out.println("Jogador 2 ganhou!");
							System.out.println("Jogador 1 perdeu!");
						}else {
							if (j2==1 && j1==0) {
								System.out.println("Jogador 2 ganhou!");
								System.out.println("Jogador 1 perdeu!");
							}else {
								System.out.println("Empate!");
							}
						}
					}
				}
			}
		}
	}
}
