package Matrizes;

import java.util.Arrays;

public class Matrizes {
    public static double saldoFinalCliente(double[][]meuArray, int cliente) {
        return meuArray[cliente][meuArray[cliente].length - 1];
        }

        public static double[] saldoFinalTodos(double[][]meuArray) {
        double[]saldoFinal = new double[meuArray.length];
            for (int i = 0; i < meuArray.length; i++) {
                saldoFinal[i] = meuArray[i][meuArray[i].length - 1];
            }
            return saldoFinal;
        }
        public static void saldosClientes(double[][]meuArray) {
            for (int i = 0; i < meuArray.length ; i++) {
                System.out.printf("Cliente %d: |", i);
                for (int j = 0; j < meuArray[0].length; j++) {
                    System.out.printf("%.2f\t|", meuArray[i][j]);

                }
                System.out.println();
            }
        }


    public static void main(String[] args) {
        double[][] array = new double[3][3];

        array[0][0] = 10.00;
        array[0][1] = 10.00;
        array[0][2] = 10.00;

        array[1][0] = 20.00;
        array[1][1] = 20.00;
        array[1][2] = 20.00;

        array[2][0] = 20.00;
        array[2][1] = 20.00;
        array[2][2] = 190.00;

        System.out.println("Cada cliente ficou com esse respectivo valor no fim do periodo: " + Arrays.toString(saldoFinalTodos(array)));
        System.out.println("Saldo final do cliente: " + saldoFinalCliente(array,0));
        saldosClientes(array);



    }


}

