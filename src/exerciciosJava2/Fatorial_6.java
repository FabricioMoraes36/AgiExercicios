<<<<<<<< HEAD:src/exerciciosJava2/Fatorial_6.java
package exerciciosJava2;
========
package Exercicios;
>>>>>>>> 0524111dad170717026556be9b9b7ff21e0835d7:src/Exercicios/Fatorial_6.java

import java.util.Scanner;

public class Fatorial_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para achar o fatorial:");
        int n = sc.nextInt();
        int resultado = 1;
        for (int i = 1; i <= n ; i++) {
            resultado *= i;
            System.out.println(resultado);

        }
        }


    }
