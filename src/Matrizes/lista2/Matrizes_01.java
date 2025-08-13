package Matrizes.lista2;

import java.util.Arrays;

public class Matrizes_01 {
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
        double[][] array = {{110,20,32},{344,321,2334},{10,60,455}};


        System.out.println("Cada cliente ficou com esse respectivo valor no fim do periodo: " + Arrays.toString(saldoFinalTodos(array)));
        System.out.println("Saldo final do cliente: " + saldoFinalCliente(array,0));
        saldosClientes(array);



    }


}

