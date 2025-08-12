package Matrizes.lista1;

import java.util.Arrays;

public class ex9 {

    public static double somaTotal(double[][]matriz){
        double soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];

            }
        }
        return soma;
    }

    public static double[] maiorValor(double[][] matriz) {
        double[]maiorValor = new double[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            double a = matriz[i][0];
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > a) {
                   a =  matriz[i][j];
                }
                maiorValor[i] = a;

            }

        }
        return maiorValor;
    }
        public static void main (String[]args){
            double[][] matriz = new double[3][2];
            matriz[0][0] = 10;
            matriz[0][1] = 15;

            matriz[1][0] = 20;
            matriz[1][1] = 25;

            matriz[2][0] = 31;
            matriz[2][1] = 32;


            System.out.println(somaTotal(matriz));
            System.out.println(Arrays.toString(maiorValor(matriz)));

        }
    }
