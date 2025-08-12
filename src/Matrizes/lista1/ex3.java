package Matrizes.lista1;

import java.util.Arrays;

public class ex3 {

    public static double saldoTotal(double[][]matriz){
        double total = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                total = total + matriz[i][j];

            }

        }
        return total;
    }
    public static double[] mediaLinha(double[][]matriz) {
        double[] calculoMedia = new double[3];
        for (int i = 0; i < matriz.length; i++) {
            double a = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                a += matriz[i][j];
            }
            calculoMedia[i] = a / matriz[i].length;
        }
        return calculoMedia;
    }
    /*public static double calcularMedia(double[][]matriz) {
        double media = Total(matriz);
        double prazo = 0;
        for (int i = 0; i < matriz.length; i++) {
            prazo = i;
        }
       int totalMedia = matriz.length * matriz[1].length;
        return media / totalMedia;
    }
    */


    public static void main(String[] args) {
        double[][]matriz = new double[3][4];
        matriz[0][0]=400;
        matriz[0][1]=1;
        matriz[0][2]=0;

        matriz[1][0] = 10;
        matriz[1][1] = 0;
        matriz[1][2] = 0;

        matriz[2][0] = 12;
        matriz[2][1] = 1;
        matriz[2][2] = 0;

        System.out.println(saldoTotal(matriz));
        System.out.println(Arrays.toString(mediaLinha(matriz)));

        }

    }

