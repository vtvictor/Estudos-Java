package Java;

import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAdivinhar = random.nextInt(100) + 1;
        int tentativas = 0;
        int palpite = 0;

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");

        while (palpite != numeroAdivinhar) {
            System.out.print("Digite o seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroAdivinhar) {
                System.out.println("Tente um número maior!");
            } else if (palpite > numeroAdivinhar) {
                System.out.println("Tente um número menor!");
            }
        }

        System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativa(s).");

        scanner.close();
    }
}

