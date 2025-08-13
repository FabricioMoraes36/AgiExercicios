package Matrizes.lista2;


//6. Distribuição de Receitas por Agência
//Uma matriz double[A][S] representa o total de receitas obtidas por A agências em S segmentos (crédito, tarifas, câmbio etc.).
//Métodos a implementar:
//double[] totalPorAgencia(double[][] receitas) – retorna um vetor com o total arrecadado por cada agência.
//
//
//double[] percentualPorSegmento(double[][] receitas) – retorna o percentual que cada segmento representa no total geral.

import java.util.Arrays;

public class Matrizes_06 {
    public static double[] totalPorAgencia(double[][] matriz){
        double[] percentual = new double[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            double total = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                total += matriz[i][j];
            }
            percentual[i] = total;
        }
        return percentual;
    }
    public static double[] percentualPorAgencia(double[][] matriz) {
        double[]percentual = totalPorAgencia(matriz);
        double total = 0;
        for (double t : percentual){
            total += t;
        }
        double[] totalPercentual = new double[matriz.length];

        for (int i = 0; i < matriz.length ; i++) {
            totalPercentual[i] = (percentual[i]/total)* 100;

        }
        return totalPercentual;
    }

    public static void main(String[] args) {
        double[][] matriz ={{10,10,10},{30,30,30},{20,20,20}};

        System.out.println("Total de cada agencia: " + Arrays.toString(totalPorAgencia(matriz)));
        double[]porcentagemDoTotal = percentualPorAgencia(matriz);
        for (int i = 0; i < matriz.length; i++) {
            System.out.printf("Cliente %d: %.2f%%\n",i,porcentagemDoTotal[i]);
        }
    }

}
