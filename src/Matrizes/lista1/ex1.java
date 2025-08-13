package Matrizes.lista1;

import java.util.Random;
public class ex1 {
    public static void preencher(double[][]matriz){
        Random rand = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                double valor = rand.nextDouble();
                matriz[i][j] = valor;
                System.out.println(matriz[i][j]);
            }
        }
    }
    public static double soma(double[][]matriz){
        double soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma = soma + matriz[i][j];

            }

        }
        return soma;
    }

    public static void main(String[] args) {
        double[][]matriz = new double[2][3];
        preencher(matriz);
        System.out.println(soma(matriz));



    }
}
