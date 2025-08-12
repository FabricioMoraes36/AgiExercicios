package exerciciosJava2;

import java.util.Scanner;

public class Tabuada_3 {
    /*Implemente um programa que, com base em um número inteiro digitado pelo usuário, exiba a tabuada desse número*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero intero que deseja saber a tabuada");
        int num = sc.nextInt();
        for (int i = 0; i <= 10; i++) {
            int mult = num * i;
            System.out.println(i + " x " + num +" = " + mult);

        }
    }
}
