package Matrizes.lista2;

import java.util.Arrays;

//10. Controle de Saques e Depósitos
//Uma matriz double[N][M] armazena movimentações diárias de N contas bancárias (valores positivos são depósitos, negativos são saques).
//Métodos a implementar:
//double totalSaques(double[][] mov) – retorna o total sacado em todas as contas.
//
//
//double totalDepositos(double[][] mov) – retorna o total depositado.
//
//
//double[] saldoFinalContas(double[][] mov) – retorna o saldo final de cada conta.
public class Matrizes_10 {
    public static double totalSaque(double[][]matriz){
        double gastos = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] < 0){
                    gastos += matriz[i][j];
                }

            }

        }
        return gastos;
    }
    public static double totalDepositado(double[][]matriz){
        double deposito = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] > 0){
                    deposito += matriz[i][j];
                }

            }

        }
        return deposito;
    }
    public static double[] saldoFinalContas(double[][] matriz){
        double[] saldo = new double[matriz.length];
        int conta = 0;
        for (int i = 0; i < matriz.length; i++) {
            conta = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                conta += matriz[i][j];
            }
            saldo[i] = conta;

        }
        return saldo;
    }

    public static void main(String[] args) {
            double[][] matriz ={{100,-15,-15},{20,-20,20},{30,30,30}};

        System.out.println(totalSaque(matriz));
        System.out.println(totalDepositado(matriz));
        System.out.println(Arrays.toString(saldoFinalContas(matriz)));
    }
}
