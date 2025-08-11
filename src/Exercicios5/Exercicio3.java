package Exercicios5;

public class Exercicio3 {
//verifica a media de crescimento de uma ação em um determinado prazo

    public static double calculoMedia(double[]array,int prazo){
        if (prazo > array.length) {
            throw new IllegalArgumentException("Prazo maior que o tamanho do array");
        }
        double media = 0;
        for (int i = 0; i < prazo; i++) {
            media += array[i];
        }

        return media/prazo;
    }

    public static void main(String[] args) {
        double[]array = new double[5];
        array[0] = 5;
        array[1] = 5;
        array[2] = 5;
        array[3] = 5;
        array[4] = 5;

        System.out.println(calculoMedia(array,4));
    }

}
