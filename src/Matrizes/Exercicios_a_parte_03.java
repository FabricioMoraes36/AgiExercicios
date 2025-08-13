package Matrizes;

public class Exercicios_a_parte_03 {
    public static double valores(double[][] matriz) {
        double maiorValor = matriz[0][0];
        int cliente = 0;
        int dia = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (maiorValor < matriz[i][j]) {
                    maiorValor = matriz[i][j];
                    cliente = i;
                    dia = j;
                }


            }
        }
        System.out.println("O cliente com maior valor: " + cliente + " e o dia desse valor: " + dia);
        return maiorValor;
    }

    public static void main(String[] args) {
        double[][] matriz ={{100,10,110},{10,20,10}};
        System.out.println("O maior valor é: " + valores(matriz));
    }
}
