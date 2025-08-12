package Matrizes.lista1;

public class ex5 {
    public static double Total(double[][]matriz){
        double total = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                total = total + matriz[i][j];

            }

        }
        return total;
    }

    public static double mediaTotal(double[][]matriz){

        double media = Total(matriz);
        double prazo = 0;
        for (int i = 0; i < matriz.length; i++) {
            prazo = i;
        }
        int totalMedia = matriz.length * matriz[1].length;
        return media / totalMedia;
    }

    public static void main(String[] args) {

        double[][] matriz = new double[2][2];
        matriz[0][0] = 400;
        matriz[0][1] = 1;


        matriz[1][0] = 10;
        matriz[1][1] = 0;

        System.out.println(mediaTotal(matriz));
    }
}
