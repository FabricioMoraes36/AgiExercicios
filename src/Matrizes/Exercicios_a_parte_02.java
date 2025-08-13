package Matrizes;

import java.util.Arrays;

public class Exercicios_a_parte_02 {
    public static double[][] matrizInvertida(double[][] matriz) {
        double[][] invertida = new double[matriz[0].length][matriz.length];
        double invertido = 0;
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                invertido = matriz[i][j];
                invertida[j][i] =  invertido;

            }
        }
        return invertida;
    }

    public static void main(String[] args) {
        double[][] matriz = {{10,20},{30,40}};
        System.out.println("Matriz normal:" + Arrays.deepToString(matriz));
        System.out.println("Matriz Invertida:" + Arrays.deepToString(matrizInvertida(matriz)));
    }
}
