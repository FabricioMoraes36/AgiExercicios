package Matrizes.lista1;

import java.util.Arrays;

public class ex8 {
    public static int[] somarVendasPorMes(int[][] matriz) {
        //linha
        int[]somas = new int[matriz.length];
        int soma = 0;
        for (int i = 0; i < matriz.length ; i++) {
            //coluna
            for (int j = 0; j < matriz[i].length; j++) {
                soma = matriz[i][j];
                somas[i] += soma;
            }

        }
        return somas;
    }

    public static void main(String[] args) {
        int[][] matriz = new int[2][2];
        matriz[0][0] = 10;
        matriz[0][1] = 10;

        matriz[1][0] = 20;
        matriz[1][1] = 20;

        System.out.println(Arrays.toString(somarVendasPorMes(matriz)));
    }
}
