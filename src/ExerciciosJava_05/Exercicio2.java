package ExerciciosJava_05;

import java.util.Arrays;
//calcula em porcentagem quanto uma ação cresceu em um prazo
public class Exercicio2 {

    public static double[] porcentagem(double[] array) {
        double calculo = ((array[array.length - 1] - array[0]) / array[0]) * 100;
        double[] valorFinalPorcentagem = {calculo};
        return valorFinalPorcentagem;

    }

    public static void main(String[] args) {
        double[] valor = new double[5];
        valor[0] = 10.34;
        valor[1] = 17.32;
        valor[2] = 22.6;
        valor[3] = 45.5;
        valor[4] = 47.3;

        System.out.println(Arrays.toString(porcentagem(valor)));

    }
}