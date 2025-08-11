package Matrizes;

import java.util.Arrays;

public class Matrizes_02 {

    public static double totalPago(double[][] array,int cliente){
        double total = 0;
        for (int i = 0; i < array[cliente].length; i++) {
            total += array[cliente][i];

        }
        return total;
    }

    public static double[] totalPagoTodos(double[][]array){
        double[]todos = new double[array.length];
        for (int i = 0; i < array.length ; i++) {
            double total = 0;
            for (int j = 0; j < array[i].length; j++) {
                total += array[i][j];

            }
            todos[i] = total;

        }
        return todos;
    }

    public static int clienteComMaiorDivida(double[][] array) {
     int cliente = 0;
     double valorMax = totalPago(array,0);
        for (int i = 0; i < array.length; i++) {
        double somaAtual = totalPago(array,i);
        if (somaAtual > valorMax) {
            valorMax = somaAtual;
            cliente = i;
        }

        }
        return cliente;
    }

    public static void main(String[] args) {
        double[][]array = new double[3][3];
        array[0][0] = 10;
        array[0][1] = 10;
        array[0][2] = 10;

        array[1][0] = 200;
        array[1][1] = 20;
        array[1][2] = 20;

        array[2][0] = 300;
        array[2][1] = 30;
        array[2][2] = 30;
        //System.out.println("é o total pago pelo cliente: ");
        //System.out.println(totalPago(array,2));

        //System.out.println(Arrays.toString(totalPagoTodos(array)));

        System.out.println(clienteComMaiorDivida(array));
    }
}
