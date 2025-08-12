<<<<<<<< HEAD:src/exerciciosJava2/Quadrado_4.java
package exerciciosJava2;
========
package Exercicios;
>>>>>>>> 0524111dad170717026556be9b9b7ff21e0835d7:src/Exercicios/Quadrado_4.java

import java.util.Scanner;

public class Quadrado_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0,impares = 1,num;
        System.out.println("Digite um numero:");
        num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            soma += impares;
            impares += 2;
            }

        System.out.println("o valor de " + num + " ao quadrado é " + soma);
        }


    }

