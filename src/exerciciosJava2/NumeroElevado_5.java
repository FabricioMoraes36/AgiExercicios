<<<<<<<< HEAD:src/exerciciosJava2/NumeroElevado_5.java
package exerciciosJava2;
========
package Exercicios;
>>>>>>>> 0524111dad170717026556be9b9b7ff21e0835d7:src/Exercicios/NumeroElevado_5.java

import java.util.Scanner;

public class NumeroElevado_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.println("Digite quantas vezes o numero será elevado: ");
        int num2 = sc.nextInt();
        int i = 0;
        int resultado = 1;

        while (i < num2) {
            resultado = resultado * num1;
            i++;
            if (i == num2) {
                System.out.println(resultado);
            }
        }
    }

    }

