package Matrizes.lista2;
import java.util.Arrays;

//4. Monitoramento de Transações Acima do Limite
//Uma matriz double[N][D] armazena o valor de transações feitas por N clientes durante D dias.
// Transações acima de R$10.000 devem ser sinalizadas.
//Métodos a implementar:
//boolean[][] transacoesSuspeitas(double[][] transacoes, double limite) – retorna uma matriz booleana com as transações suspeitas.
//
//
//void exibirTransacoesSuspeitas(double[][] transacoes, boolean[][] flags) – exibe cliente, dia e valor de cada transação acima do limite.
public class Matrizes_04 {
    public static boolean[][] valorSus(double[][] matriz, double limite) {
        boolean[][] sus = new boolean[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {        // percorre as linhas (índice i)
            for (int j = 0; j < matriz[i].length; j++) {
                double valor = matriz[i][j];
                sus[i][j] = (valor > limite);
            }
        }
return sus;
    }
    public static void exibir(double[][] matriz,boolean[][]suspeitos) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (suspeitos[i][j]) {
                    System.out.println("cliente: " + i + " no dia: " + j + " valor: " + matriz[i][j]);
                }

            }

        }

    }

    public static void main(String[] args) {
        double[][] matriz = new double[3][3];
        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;

        matriz[1][0] = 10001;
        matriz[1][1] = 2000;
        matriz[1][2] = 300;

        matriz[2][0] = 20;
        matriz[2][1] = 12000;
        matriz[2][2] = 334;

        boolean[][] suspeitos = valorSus(matriz,10000);

        System.out.println("Na matriz a seguir: true = suspeita; false = aprovada");
        System.out.println(Arrays.deepToString(valorSus(matriz, 10000)));
        exibir(matriz,suspeitos);

    }
}
