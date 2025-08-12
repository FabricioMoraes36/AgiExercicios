<<<<<<<< HEAD:src/exerciciosJava2/Fibonacci_7.java
package exerciciosJava2;
========
package Exercicios;
>>>>>>>> 0524111dad170717026556be9b9b7ff21e0835d7:src/Exercicios/Fibonacci_7.java

import java.util.Scanner;

public class Fibonacci_7 {
    public static void main(String[] args) {
        int a = 0,b = 1,c = 0;
        int n;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Primeiro termo da fibonacci:" + a);
        System.out.println("Segundo termo da fibonacci:" + b);

        while(c < n) {
         c = a + b;
           a = b;
           b = c;
            System.out.println("Proximo da seq.fibonacci: " + c);

        }
    }
}
