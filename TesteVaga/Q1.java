package TesteVaga;

import java.util.Scanner;

class Q1{
    public static void main(String arg[]){
        int INDICE = 13;
        int SOMA = 0;
        int K = 0;
    
        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }
    
        System.out.println(SOMA);
    }
}
