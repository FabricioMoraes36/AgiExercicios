package Matrizes.lista2;

// . Controle de Limite de Crédito por Categoria
//Uma matriz double[N][T] representa os valores gastos por N clientes em T tipos de compra (mercado, viagens, serviços etc.).
// Normalize os valores para ficar entre 0 e 1, com base no maior gasto total individual.
//Métodos a implementar:
//double gastoMaximoCliente(double[][] gastos, int cliente) – retorna o maior gasto entre as categorias de um cliente.
//
//
//double[][] normalizarGastos(double[][] gastos) – retorna uma nova matriz com os valores normalizados.

import java.util.Arrays;

public class Matrizes_08 {
    public static double gastoMaximoCliente(double[][] matriz,int cliente) {
        double maiorGasto = Double.MIN_VALUE;
            maiorGasto = 0;
            for (int j = 0; j < matriz[cliente].length; j++) {
                if (matriz[cliente][j] > maiorGasto) {
                    maiorGasto = matriz[cliente][j];
                }

        }
        return maiorGasto;
    }
    public static double[][] normalizarGastos(double[][] matriz) {
        double[][] norm = new double[matriz.length][matriz[0].length];
        double valorNormalizado = 0;
        for (int i = 0; i < matriz.length; i++) {
            double maiorGasto = gastoMaximoCliente(matriz,i);
            for (int j = 0; j < matriz[i].length; j++) {
                valorNormalizado = matriz[i][j] / maiorGasto;
                norm[i][j] = valorNormalizado;
            }
        }
return norm;
    }

    public static void main(String[] args) {
        double[][] matriz ={{10,20,30},{40,50},{132,260,3400}};
        System.out.println(gastoMaximoCliente(matriz,2));
        double[][] normalizado = normalizarGastos(matriz);
        for (int i = 0; i < normalizado.length; i++) {
            System.out.print("Cliente " + i + ": ");
            for (int j = 0; j < normalizado[i].length; j++) {
                System.out.printf("%.2f ", normalizado[i][j]);
            }
            System.out.println();
        }

    }
}
