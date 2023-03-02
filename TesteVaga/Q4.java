package TesteVaga;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        ####Questao A)####
        double distanciaTotal = 100;
        double velocidadeCarro = 110;
        double velocidadeCaminhao = 80;
        double tempoCaminhaoPedagio = 5.0/60.0; // em horas

        double tempoEncontro = distanciaTotal / (velocidadeCarro + velocidadeCaminhao);
        double distanciaCarro = velocidadeCarro * tempoEncontro;
        double distanciaCaminhao = velocidadeCaminhao * (tempoEncontro + tempoCaminhaoPedagio);

        if (distanciaCarro < distanciaCaminhao) {
            System.out.println("O carro está mais próximo de Ribeirão Preto.");
        } else {
            System.out.println("O caminhão está mais próximo de Ribeirão Preto.");
        }

    
        ####Questao B)####
        double distancia = 100.0; // km
        double velocidadeCarro = 110.0; // km/h
        double velocidadeCaminhao = 80.0; // km/h
        double tempoViagemCaminhao = distancia / velocidadeCaminhao + 0.1667 * 2;
        double tempoViagemCarro = distancia / velocidadeCarro;

        if (tempoViagemCarro < tempoViagemCaminhao) {
            System.out.println("O carro estará mais próximo da cidade de Ribeirão Preto.");
        } else {
            System.out.println("O caminhão estará mais próximo da cidade de Ribeirão Preto.");
        }

    }
}