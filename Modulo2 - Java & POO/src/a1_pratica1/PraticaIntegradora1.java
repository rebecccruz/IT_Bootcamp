package a1_pratica1;

public class PraticaIntegradora1 {

    public static void main(String[] args) {
        String[] cidades = {"Londres", "Madrid", "Nova York", "Buenos Aires", "Assuncion", "Sao Paulo", "Lima", "Santiago", "Lisboa", "Toquio"};
        int[][] temperatura = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};

        String cidadeMin = cidades[0], cidadeMax = cidades[0];
        int tempMin = temperatura[0][0], tempMax = temperatura[0][1];

        for (int i = 0; i < temperatura.length; i++) {
            if (tempMin > temperatura[i][0]) {
                tempMin = temperatura[i][0];
                cidadeMin = cidades[i];
            }
            if (tempMax < temperatura[i][1]) {
                tempMax = temperatura[i][1];
                cidadeMax = cidades[i];
            }
        }

        System.out.printf("Mínimo: (%d): %s \n", tempMin, cidadeMin);
        System.out.printf("Máximo: (%d): %s \n", tempMax, cidadeMax);

    }
}
