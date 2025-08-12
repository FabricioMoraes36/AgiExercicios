<<<<<<<< HEAD:src/exerciciosJava1/PagamentoParcelado.java
package exerciciosJava1;
========
package Exercicios;
>>>>>>>> 0524111dad170717026556be9b9b7ff21e0835d7:src/Exercicios/PagamentoParcelado.java

import java.util.Scanner;

public class PagamentoParcelado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da compra que deseja parcelar:");
        double valorCompra = sc.nextDouble();
        System.out.println("Em quantas vezes deseja parcelar a compra ? *Lembre que por mes haverá um juros de 2% sobre o valor...*");
        double numeroParcelas = sc.nextDouble();

        for (int i = 0; i < numeroParcelas; i++) {
            valorCompra = valorCompra * (1 + 0.02);
            String valorFormatado = String.format("%.2f",valorCompra);
            System.out.println("O valor no mes " + i + " é de: " + valorFormatado);

        }
    }
}
