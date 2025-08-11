package Exercicios5;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Exercicio_02 {
    public static double[]variacaoDiaria(double[]array) {
        double[] variacao = new double[array.length - 1];
        for (int i = 0; i < array.length - 1; i++) {
            variacao[i] = ((array[i + 1] - array[i]) /array[i])*100;
        }
        return variacao;
    }

    public static void main(String[] args) {
        double[]vetor ={100,102,104,110,100};
    double[]vetor2 = variacaoDiaria(vetor);

    for (double variacao : vetor2){
    }
        System.out.println(Arrays.toString(vetor2));
    }


}
