package Matrizes.lista2;

//3. Avaliação de Investimentos Mensais
//Cada linha da matriz double[F][M] representa a evolução mensal da cota de um fundo de investimento ao longo de M meses.
//Métodos a implementar:
//double rentabilidade(double[][] fundos, int fundo) – retorna a variação percentual do fundo entre o 1º e o último mês.
//
//
//int fundoMaisRentavel(double[][] fundos) – retorna o índice do fundo com maior rentabilidade.

public class Matrizes_03 {
    public static double crescimento(double[][]matriz,int fundo) {
            double a = matriz[fundo][0];
            double b = matriz[fundo][matriz[fundo].length-1];
        double percentual = (b - a) / a * 100;

return percentual;
    }
    public static int fundoMaisRentavel(double[][]fundos) {
        int fundo = 0;
        double maior = 0;
        for (int i = 0; i < fundos.length; i++) {
            for (int j = 0; j < fundos[i].length; j++) {
                if (fundos[i][j] > maior) {
                    maior = fundos[i][j];
                    fundo = i;
                }
            }
        }
        return fundo;
    }
    public static void main(String[] args) {
        double[][] fundos = new double[3][3];
        fundos[0][0] = 500;
        fundos[0][1] = 600;
        fundos[0][2] = 1000;

        fundos[1][0] = 20000;
        fundos[1][1] = 40;
        fundos[1][2] = 60;

        fundos[2][0] = 31;
        fundos[2][1] = 32;
        fundos[2][2] = 40;

        System.out.println("fundo MaisRentavel: " + fundoMaisRentavel(fundos));
        System.out.printf("%.2f", crescimento(fundos, 2));


    }

        }





