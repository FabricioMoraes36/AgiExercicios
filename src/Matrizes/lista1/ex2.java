package Matrizes.lista1;

public class ex2 {
    public static double soma(double[][]matriz){
        double soma = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > soma) {
                    soma = matriz[i][j];
                }
            }

        }
        return soma;
    }

    public static void main(String[] args) {
        double[][]matriz = new double[3][4];
        matriz[0][0]=20;
        matriz[0][1]=10;
        matriz[0][2]=10;

        matriz[1][0] = 10;
        matriz[1][1] = 10;
        matriz[1][2] = 10;

        matriz[2][0] = 10;
        matriz[2][1] = 10000;
        matriz[2][2] = 10;

        System.out.println("O maior valor da matriz é: " + soma(matriz));
    }
}
