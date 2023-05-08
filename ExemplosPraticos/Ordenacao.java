import java.util.Scanner;

public class Ordenacao {
    public static void main(String[] args){
        Scanner ler = new Scanner (System.in)
        String numerosString;
        
        System.out.println("Digite uma lista de números separados por espaço: ");
        numero = ler.nextLine();
        
        String [] numerosArray = numerosArray.split(" ");

        List<Integer> numeros = new ArrayList<>();
        for (String numeroString : numerosArray){
            numeros.add(Integer.parseInt(numeroString));
        }
        
        Collections.sort(numeros);

        System.out.println("A lista ordenada é: " + numeros);
        

    }
}