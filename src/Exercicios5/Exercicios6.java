package Exercicios5;

public class Exercicios6 {
    //calcula o montante final apenas
    public static double soma(double[]array){
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        System.out.println("O montante final das suas ações é de: ");
        return total;
    }

    public static void main(String[] args) {
        double[]array = new double[5];
        array[0] = 10;
        array[1] = 10;
        array[2] = 10;
        array[3] = 10;
        array[4] = 10;

        System.out.println(soma(array));
    }
}
