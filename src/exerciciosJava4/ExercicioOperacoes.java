package exerciciosJava4;

import java.util.Scanner;

public class ExercicioOperacoes {
    static Scanner sc = new Scanner(System.in);

    public static double conversao(double a, double b) {
        System.out.println("Moedas convertidas");
        return a / b;
    }

    public static double jurosSimples(double capital, double taxa, int prazo) {
        taxa = taxa / 100;
        return capital + (capital * taxa) * prazo;
    }

    public static double calculoAcao(double valorDia1, double valorDia2) {
        return ((valorDia2 - valorDia1) /valorDia1) * 100;
    }

    public static double compararAtivos(double valor1,double valor2,double resultado){
        if (valor1 > valor2){
            resultado = valor1;
            System.out.print("o maior ativo é ");
            return resultado;
        } else {
            resultado = valor2;
            System.out.print("O maior é: ");
            return resultado;


        }
    }

}
