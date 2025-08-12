package Matrizes.lista1;

import java.util.Arrays;

public class ex4 {
    public static double[] calculo(double[][]matriz) {
        double[]menores = new double[2];
        for (int i = 0; i < matriz[0].length; i++) {
            menores[i] = matriz[0][i];
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] < menores[i]){
                    menores[i] = matriz[i][j];
                }

            }
        }
        return menores;
    }
    public static void main(String[] args) {
        double[][]matriz = new double[2][2];
        matriz[0][0]=400;
        matriz[0][1]=1;


        matriz[1][0] = 10;
        matriz[1][1] = 0;

        System.out.println(Arrays.toString(calculo(matriz)));

    }
}
