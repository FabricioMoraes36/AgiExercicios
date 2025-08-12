package Matrizes.lista1;

public class ex10 {

    public static int maiorPagador(double[][]matriz){
        int cliente = 0;
        double maior = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    cliente = i;
                }
            }
        }
        return cliente;
    }

    public static double mediaTotal(double[][]matriz) {
        double soma = 0;
        double media = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
            media = soma / matriz.length;
        }
        return media;
    }
    public static void main(String[] args) {
        double[][] matriz = new double[3][3];
        matriz[0][0] = 500;
        matriz[0][1] = 15;

        matriz[1][0] = 20;
        matriz[1][1] = 285;

        matriz[2][0] = 31;
        matriz[2][1] = 32;

        System.out.println(mediaTotal(matriz));
        System.out.println(maiorPagador(matriz));
    }
}
