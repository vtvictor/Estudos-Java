package br.edu.ifs.fundamento.ListaRevisao;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int t, n, total=0;
		String alimento;
		
		System.out.println("Informe a quantidade de alimentos que consome diariamente (1 a 7):");
		t=entrada.nextInt();
		
		for (int i=0;i<t;i++) {
			total=0;
			System.out.println("Informe o alimento (sem acentuações):");
			alimento=entrada.next();
			
			System.out.println("Informe a quantidade: ");
			n=entrada.nextInt();
			
			if (alimento.equals("suco")) {
				total+=n*120;
				if(total>=110 && total<=130) {
					System.out.println(total+ "mg");
				} else {
					if(total<=110) {
						total=110-total;
						System.out.println("Mais "+total+" mg");
					}else {
						total=total-130;
						System.out.println("Menos "+total+" mg");
					}
				}
			}
			if (alimento.equals("morango")) {
				total+=n*85;
				if(total>=110 && total<=130) {
					System.out.println(total+ "mg");
				} else {
					if(total<=110) {
						total=110-total;
						System.out.println("Mais "+total+" mg");
					}else {
						total=total-130;
						System.out.println("Menos "+total+" mg");
					}
				}
			}
			if (alimento.equals("mamao")) {
				total+=n*85;
				if(total>=110 && total<=130) {
					System.out.println(total+ "mg");
				} else {
					if(total<=110) {
						total=110-total;
						System.out.println("Mais "+total+" mg");
					}else {
						total=total-130;
						System.out.println("Menos "+total+" mg");
					}
				}
			}
			if (alimento.equals("goiaba")) {
				total+=n*70;
				if(total>=110 && total<=130) {
					System.out.println(total+ "mg");
				} else {
					if(total<=110) {
						total=110-total;
						System.out.println("Mais "+total+" mg");
					}else {
						total=total-130;
						System.out.println("Menos "+total+" mg");
					}
				}
			}
			if (alimento.equals("manga")) {
				total+=n*56;
				if(total>=110 && total<=130) {
					System.out.println(total+ "mg");
				} else {
					if(total<=110) {
						total=110-total;
						System.out.println("Mais "+total+" mg");
					}else {
						total=total-130;
						System.out.println("Menos "+total+" mg");
					}
				}
			}
			if (alimento.equals("laranja")) {
				total+=n*50;
				if(total>=110 && total<=130) {
					System.out.println(total+ "mg");
				} else {
					if(total<=110) {
						total=110-total;
						System.out.println("Mais "+total+" mg");
					}else {
						total=total-130;
						System.out.println("Menos "+total+" mg");
					}
				}
			}
			if (alimento.equals("brocolis")) {
				total+=n*34;
				if(total>=110 && total<=130) {
					System.out.println(total+ "mg");
				} else {
					if(total<=110) {
						total=110-total;
						System.out.println("Mais "+total+" mg");
					}else {
						total=total-130;
						System.out.println("Menos "+total+" mg");
					}
				}
			}
		}

	}

}
