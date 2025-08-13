package Matrizes.lista2;
//7. Monitoramento de Cartões de Crédito
//Uma matriz double[C][M] registra os gastos de C clientes com cartões de crédito durante M meses.
//Métodos a implementar:
//double gastoTotalCliente(double[][] gastos, int cliente) – retorna o gasto total de um cliente.
//
//
//int clienteMaiorGasto(double[][] gastos) – retorna o índice do cliente com maior gasto acumulado.
public class Matrizes_07 {
    public static double gastoTotalCliente(double[][] matriz, int cliente) {
        double soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            soma = 0;
            for (int j = 0; j < matriz[cliente].length; j++) {
                soma += matriz[cliente][j];
            }

        }
        return soma;
    }
    public static int clienteMaiorGasto(double[][] matriz) {
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

    public static void main(String[] args) {
        double[][] matriz ={{10,10,10},{20,20,20},{30,30,30}};

        System.out.println(gastoTotalCliente(matriz,0));
        System.out.println("Cliente com a maior divida é o: " +  clienteMaiorGasto(matriz));
    }
}
