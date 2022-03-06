package br.edu.ifs.fundamento.Exercicio3;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {	
		Scanner entrada = new Scanner (System.in);
		int idade;
		
		System.out.println("Informe a idade do nadador: ");
		idade=entrada.nextInt();
		
		if (idade<5) {
			System.out.println("Categoria: Não existe!");
		}else {
			if(idade>=5 && idade<=7) {
				System.out.println("Categoria: Infantil A");
			} else {
				if (idade>=8 && idade<=11) {
					System.out.println("Categoria: Infantil B");
				} else {
					if(idade>=12 && idade<=13) {
						System.out.println("Categoria: Juvenil A");
					} else {
						if (idade>=14 && idade<=17) {
							System.out.println("Categoria: Juvenil B");
						} else {
							System.out.println("Categoria: Adultos");
						}
					}
				}
			}
		}
		
	}

}
