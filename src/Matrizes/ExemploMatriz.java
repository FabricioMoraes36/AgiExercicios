package Matrizes;

public class ExemploMatriz {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        array[0][0] = 10;
        array[0][1] = 20;
        array[0][2] = 30;

        array[1][0] = 10;
        array[1][1] = 50;
        array[1][2] = 30;

        array[2][0] = 10;
        array[2][1] = 20;
        array[2][2] = 30;

        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i][i];

        }
        System.out.println("A somarVendasPorMes da diagonal principal é: " + total);

       /* for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {

            }

        }
        */

    }
}
