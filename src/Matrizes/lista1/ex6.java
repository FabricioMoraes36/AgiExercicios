package Matrizes.lista1;

import java.util.Arrays;

public class ex6 {
    public static double[] valorPorTrimestre(double[][]matriz){
        double[]retorno = new double[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                retorno[i] += matriz[j][i];
            }

        }
        return retorno;
    }

    public static void main(String[] args) {
        double[][] matriz = new double[3][3];
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;
        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 9;

        //retorno esperado : 12,15,18

        System.out.println("A somarVendasPorMes de cada trimestre é:" + Arrays.toString(valorPorTrimestre(matriz)));
    }
}
