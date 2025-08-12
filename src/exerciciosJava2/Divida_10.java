<<<<<<<< HEAD:src/exerciciosJava2/Divida_10.java
package exerciciosJava2;
========
package Exercicios;
>>>>>>>> 0524111dad170717026556be9b9b7ff21e0835d7:src/Exercicios/Divida_10.java

import java.util.Scanner;

public class Divida_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quitando a divida");
        System.out.println("Digite o valor da sua divida");
        double divida = sc.nextDouble();
        for (int i = 1; i <= divida; i++) {
            System.out.println("Agora digite quanto da sua divida você irá pagar no mes " + i);
            double valorPago = sc.nextDouble();
            divida = divida - valorPago;
            System.out.println("Sua divida após o pagamento ficou em: " + divida);
            if (divida <=0){
                System.out.println("DIVIDA QUITADA NO MÊS " + i);
                break;
            }

        }
    }
}
