package a3_pratica2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Garagem garagem = new Garagem();

        garagem.addVeiculo(new Veiculo("Ford", "Fiesta", 1000));
        garagem.addVeiculo(new Veiculo("Ford", "Focus", 1200));
        garagem.addVeiculo(new Veiculo("Ford", "Explorer", 2500));


        System.out.println("Lista ordenada por valor: ");

        System.out.println("Lista ordenada por marca: ");

        System.out.println("Veículos com valores abaixo de 1000: ");

        System.out.println("Veículos com valores acima de 1000: ");

        System.out.println("Valor médio do total de veículos: ");

        System.out.println();


    }
}
