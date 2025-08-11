package Exercicios5;

public class Exercicio7 {
    //calcula o valor total
    //calcula quanto cada valor representa no montante final
    public static double valorTotal(double[]total) {
        double soma = 0;
        if (total != null){
        for (int i = 0; i < total.length; i++) {
            soma += total[i];
        }
            System.out.println("O valor da soma de todas as ações é de:");
            return soma;
        }
        return soma;
    }
    public static void percentual(double[]total) {
        double soma = 0;
        double porcentagem = 0;
        for (int i = 0; i < total.length; i++) {
            soma += total[i];
            }
        for (int i = 0; i < total.length; i++) {
            porcentagem = (total[i] / soma) * 100;
            System.out.println("O índice " + i + " representa " + porcentagem + "% do montante final");

        }
    }

    public static void main(String[] args) {
        double[]array = new double[5];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 20;
        array[4] = 20;

        System.out.println(valorTotal(array));
        percentual(array);
    }

}
