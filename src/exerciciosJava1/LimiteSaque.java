<<<<<<<< HEAD:src/exerciciosJava1/LimiteSaque.java
package exerciciosJava1;
========
package Exercicios;
>>>>>>>> 0524111dad170717026556be9b9b7ff21e0835d7:src/Exercicios/LimiteSaque.java

import java.util.Scanner;

public class LimiteSaque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu saldo:");
        double saldo = sc.nextDouble();
        System.out.println("Quanto deseja sacar:");
        double saque = sc.nextDouble();

        if (saque <= saldo){
            saldo = saldo - saque;
            System.out.println("O saque foi liberado!! seu saldo atual é de: " + saldo);
        }else{
            System.out.println("Saldo insuficiente para saque!!");

        }
    }
}
