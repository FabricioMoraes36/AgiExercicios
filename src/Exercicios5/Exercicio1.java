package Exercicios5;
public class Exercicio1{

    //exercicio da trinca

public static double[] trinca(double[] array) {
    for (int i = 0; i < array.length - 2; i++) {
        if (array[i] < array[i + 1] && array[i + 1] < array[i + 2]) {
            return new double[]{array[i], array[i + 1], array[i + 2]};
        }
    }
    return null;
}
public static void main (String[]args){
    double[] crescimento = new double[10];

    crescimento[0] = 10.2;
    crescimento[1] = 20.5;
    crescimento[2] = 30.67;
    crescimento[3] = 40.7;
    crescimento[4] = 50.78;
    crescimento[5] = 60.12;
    crescimento[6] = 70.11;
    crescimento[7] = 80.65;
    crescimento[8] = 90.88;
    crescimento[8] = 90.89;

    double indice[] = trinca(crescimento);
    if (indice != null){
        System.out.println(crescimento.toString());
    }else {
        System.out.println("nada para mostrar");
    }
}
    }
