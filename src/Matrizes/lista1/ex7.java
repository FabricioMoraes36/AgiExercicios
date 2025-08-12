package Matrizes.lista1;

import java.util.Arrays;

public class ex7 {
    public static double menorTaxa(double[][]matriz) {

        double menorTaxa = 0;
        for (int i = 0; i < matriz.length; i++) {
            double a = matriz[i][0];
            for (int j = 0; j < matriz[i].length; j++) {
                double b = matriz[i][j];
                double taxa = (a - b) / b;
                if (taxa < menorTaxa) {
                    menorTaxa = taxa;
                }

            }
        }
        return menorTaxa;
    }

    public static double[] media(double[][]matriz) {

        //i são as linhas e j as colunas
        double[]medias = new double[matriz[0].length];
        for (int i = 0; i < matriz[0].length ; i++) {
            double soma = 0;
            for (int j = 0; j < matriz.length; j++) {
                soma += matriz[j][i];
            }
            medias[i] = soma / matriz.length;

        }
        return medias;

    }

    public static void main(String[] args) {
        double[][] matriz = new double[2][2];
        matriz[0][0] = 32;
        matriz[0][1] = 10;

        matriz[1][0] = 32;
        matriz[1][1] = 10;

        System.out.println(menorTaxa(matriz));
        System.out.println(Arrays.toString(media(matriz)));
    }
}
