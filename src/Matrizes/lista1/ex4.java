package Matrizes.lista1;

import java.util.Arrays;

public class ex4 {
    public static double[] calculo(double[][]matriz) {
        double[]vetor = new double[matriz[0].length];
        for (int i = 0; i < matriz[0].length ; i++) {
            double teste = matriz[0][i];
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[j][i] < teste) {
                    teste = matriz[j][i];
                }
                 }

            vetor[i] = teste;

        }
        return vetor;
    }
    public static void main(String[] args) {
        double[][]matriz ={{15,10},{5,23},{120,150},{1111,222222}};




        System.out.println(Arrays.toString(calculo(matriz)));

    }
}
