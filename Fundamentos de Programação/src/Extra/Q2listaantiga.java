package Extra;
import java.util.Scanner;

public class Q2listaantiga {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int hr, min, seg;
		
		System.out.println("Informe a hora: ");
		hr=entrada.nextInt();
		
		System.out.println("Informe os minutos: ");
		min=entrada.nextInt();
		
		System.out.println("Informe os segundos: ");
		seg=entrada.nextInt();
		
		seg = (hr*3600) + (min*60) + seg;
		
		System.out.println("Segundos totais: "+seg);

	}

}
