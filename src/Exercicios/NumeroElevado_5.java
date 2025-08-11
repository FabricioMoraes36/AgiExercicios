package Exercicios;

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

