package Exercicios5;

public class Exercicio_01 {

    public static double maiorPreco(double[] precos) {
        //variavel auxiliar
        double valor = precos[0];
        for (int i = 1; i < precos.length; i++) {
            if (valor < precos[i]) {
                valor = precos[i];
            }
        }
        return valor;
    }

    public static double menorPreco(double[] precos){
        double valor = precos[0];
        for (int i = 1; i < precos.length; i++) {

            if (valor > precos[i]){
                valor += precos[i];
            }

        }
        return valor;
    }

    public static void main(String[] args) {

        double [] array = new double [3];
        array[0] = 10;
        array[1] = 20;
        array[2] = 190.0;



        System.out.println("O menor preço é: "+ menorPreco(array));
        System.out.println("O maior preço é: "+maiorPreco(array));


    }
}
