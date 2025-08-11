package Exercicios;

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
