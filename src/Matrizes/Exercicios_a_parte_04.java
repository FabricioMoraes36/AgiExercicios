package Matrizes;

import java.util.Arrays;

/*5. Vendas por Produto e Loja (Difícilzinho)
Uma matriz int[P][L] armazena as vendas de P produtos em L lojas.
Crie métodos para:

Mostrar o total de vendas por produto.
somar linha

Mostrar o total de vendas por loja.
somar coluna

Indicar qual produto mais vendeu no total.
usar o soma coluna e achar o maior e indicar

Indicar qual loja mais vendeu no total.
ver qual coluna somando os elementos é a maior


*/
public class Exercicios_a_parte_04 {
    public static double[] somaPorProduto(double[][] matriz) {
        double[] totalLinhas = new double[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            double soma = 0;
            for (int j = 0; j < matriz[i].length ; j++) {
                soma += matriz[i][j];
            }
            totalLinhas[i] = soma;
        }
        return totalLinhas;
    }
public static double[] somaLoja(double[][] matriz) {
    double[] totalColunas = new double[matriz[0].length];
    for (int i = 0; i < matriz[0].length; i++) {
        double somaColuna = 0;
        for (int j = 0; j < matriz.length; j++) {
            somaColuna += matriz[j][i];
        }
        totalColunas[i] = somaColuna;

    }
    return totalColunas;
}


public static int[] maiorProdutoMaiorLoja(double[][] matriz) {
    int[] resultados = new int[2]; // [0] = produto mais vendido, [1] = loja que mais vendeu

    // Produto mais vendido
    double[] totalPorProduto = somaPorProduto(matriz);
    int produtoMaisVendido = 0;
    double maiorProduto = totalPorProduto[0];
    for (int i = 1; i < totalPorProduto.length; i++) {
        if (totalPorProduto[i] > maiorProduto) {
            maiorProduto = totalPorProduto[i];
            produtoMaisVendido = i;
        }
    }

    // Loja que mais vendeu
    double[] totalPorLoja = somaLoja(matriz);
    int lojaMaisVendida = 0;
    double maiorLoja = totalPorLoja[0];
    for (int i = 1; i < totalPorLoja.length; i++) {
        if (totalPorLoja[i] > maiorLoja) {
            maiorLoja = totalPorLoja[i];
            lojaMaisVendida = i;
        }
    }

    resultados[0] = produtoMaisVendido;
    resultados[1] = lojaMaisVendida;
    return resultados;

}


    public static void main(String[] args) {
        double[][] matriz ={{10,10,20},
                            {10,10,30}};

        System.out.println("a soma de venda das produto " + Arrays.toString(somaLoja(matriz)));//50
        System.out.println("a soma de vendas loja " + Arrays.toString(somaPorProduto(matriz)));//
        System.out.println("o produto mais vendido e a loja que mais vendeu: " + Arrays.toString(maiorProdutoMaiorLoja(matriz)));
    }
}
