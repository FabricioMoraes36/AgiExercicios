<<<<<<<< HEAD:src/exerciciosJava2/Tabuada_3.java
package exerciciosJava2;
========
package Exercicios;
>>>>>>>> 0524111dad170717026556be9b9b7ff21e0835d7:src/Exercicios/Tabuada_3.java

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
