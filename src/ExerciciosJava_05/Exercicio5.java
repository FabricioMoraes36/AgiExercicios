package ExerciciosJava_05;

import java.util.Arrays;

public class Exercicio5 {
    public static double[] variacaoDiaria(double[] array) {
        double valorAnterior = array[0]; // guarda o valor do dia anterior
        double[] restante = new double[array.length];

        for (int i = 0; i < array.length; i++) {
            double calculo;
            if (i == 0) {
                calculo = 0.0; // primeiro dia não tem variação
            } else {
                calculo = (array[i] - valorAnterior) / valorAnterior * 100;
            }
            restante[i] = calculo;
            valorAnterior = array[i]; // atualiza para o próximo cálculo
        }
        return restante;
    }

    public static void main(String[] args) {
        double[] valores = {10.1, 10.2, 10.3, 10.4, 10.5};

        System.out.println(Arrays.toString(variacaoDiaria(valores)));
    }
}
