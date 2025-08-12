package ExerciciosJava_02;

import java.util.Scanner;

public class Exercicio_12_Conversao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double limiteDiario = 1000.00;
        double dolar = 0;
        System.out.println("Conversão de BRL para DOLAR");
        System.out.println("Digite quanto voce quer converter");
        double real = sc.nextDouble();

        while (real <= limiteDiario && real > 0) {
            limiteDiario -= real;
                dolar = real / 5;
                System.out.println("o valor de " + real + " Foi convertido para:" + dolar);
                System.out.println("Seu limite de conversão diario está em: " + limiteDiario);
                if (limiteDiario <=0){
                    System.out.println("Limite diario está zerado");
                    break;
                }
                System.out.println("Digite quanto ainda quer converter ou digite 0 para sair");
                real = sc.nextDouble();

            }
        }
    }

