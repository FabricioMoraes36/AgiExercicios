package Matrizes;
//se soma a diagonal principal com 1 for só
//a diagonal secundaria é [i][matriz.length - 1 - i]
//para retornar um vetor com cada valor da diagonal principal é so tirar o += e atribuir o valor ao vetor[i]
//o mesmo vale pra secundaria
public class ExemploMatriz_Diagonal_Principal {
    public static int somaDiagonalPrincipal(int[][] matriz) {
        int total = 0;
        for (int i = 0; i < matriz.length; i++) {
            total += matriz[i][i];

        }
        return total;
    }

    public static int somaDiagonalSecundaria(int[][] matriz) {
        int total = 0;
        for (int i = 0 ; i < matriz.length; i++) {
                total += matriz[i][matriz.length - 1 - i];
            }
        return total;
    }
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        array[0][0] = 10;
        array[0][1] = 20;
        array[0][2] = 50;

        array[1][0] = 10;
        array[1][1] = 50;
        array[1][2] = 30;

        array[2][0] = 10;
        array[2][1] = 20;
        array[2][2] = 30;

        System.out.println("A soma da diagonal principal é: " + somaDiagonalPrincipal(array));
        System.out.println("A soma da diagonal secundaria é: " + somaDiagonalSecundaria(array));

       /* for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {

            }

        }
        */

    }
}
