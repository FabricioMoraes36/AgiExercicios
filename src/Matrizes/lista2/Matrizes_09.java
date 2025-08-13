package Matrizes.lista2;

//9. Classificação de Risco de Crédito
//Uma matriz int[C][Q] armazena as notas de crédito (0 a 100) de C clientes, avaliadas por Q critérios (renda, histórico, uso de limite etc.).
//Métodos a implementar:
//double mediaNotaCliente(int[][] notas, int cliente) – retorna a média das notas de um cliente.
//
//
//int[] clientesComRiscoBaixo(int[][] notas, double limiar) – retorna os índices dos clientes com média acima do limiar.

import java.util.Arrays;

public class Matrizes_09 {
    public static double mediaNotaCliente(int[][]matriz,int cliente){
        double total = 0;
        double media = 0;
            for (int j = 0; j < matriz[cliente].length; j++) {
                total += matriz[cliente][j];
            }
            media = total / matriz[cliente].length;
        return media;
    }
    public static int[] clientesComRiscoBaixo(int[][]matriz,double limiar){
        int[]clientesBaixoRisco = new int[matriz.length];
        double tamanho = 0;
        for (int i = 0; i < matriz.length; i++) {
            double medias = mediaNotaCliente(matriz, i);
                if(medias > limiar){

                    clientesBaixoRisco[i] = i;
                }
            }
        return clientesBaixoRisco;
        }
    public static void main(String[] args) {
        int[][] matriz ={{10,15,20},{20,20,20},{30,30,30}};
        System.out.println(mediaNotaCliente(matriz,0));
        System.out.println(Arrays.toString(clientesComRiscoBaixo(matriz, 20)));
    }
    }


