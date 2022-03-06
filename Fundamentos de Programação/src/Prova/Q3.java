package Prova;
import  java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int x, y;
		x= 14;
		y = -5;

		if(((12-7)>y) && ((13-x)>=27)){
			if ((x*y)>0)
				System.out.println("Jogo 1");
			else
				System.out.println("Jogo 2");
					
		}
		else {
			if ((x*y)>0)
				System.out.println("Jogo 3");
			else
				System.out.println("jogo 4");
		}

	}
}
