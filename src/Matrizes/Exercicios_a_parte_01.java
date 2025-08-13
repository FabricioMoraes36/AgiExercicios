package Matrizes;

import java.util.Arrays;

// metodoSomaTotalMatriz retorna um double com o valor da matriz toda somada
//metodo somaLinhas retorna um vetor com a soma total de todos os elementos de uma linha
//metodo somaColunas retorna um vetor com a soma total de todos os elementos da coluna

public class Exercicios_a_parte_01 {
    public static double somaTotalMatriz(double[][] matriz) {
        double total = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                total += matriz[i][j];
            }
        }
        return total;
    }
    public static double[] somaLinhas(double[][] matriz) {
        double[] totalLinhas = new  double[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length ; j++) {
                totalLinhas[i] += matriz[i][j];
            }
        }
        return totalLinhas;
    }
    public static double[] somaColunas(double[][] matriz) {
        double[] totalColunas = new  double[matriz[0].length];
        for (int i = 0; i < matriz[0].length; i++) {
            double somaColuna = 0;
            for (int j = 0; j < matriz.length; j++) {
                somaColuna += matriz[j][i];

                totalColunas[i] = somaColuna;
            }

        }
        return totalColunas;
    }

    public static void main(String[] args) {
        double[][] matriz ={{10,20,50},
                            {10,20,30}};

        System.out.println(somaTotalMatriz(matriz));
        System.out.println(Arrays.toString(somaLinhas(matriz)));
        System.out.println(Arrays.toString(somaColunas(matriz)));
    }
}
