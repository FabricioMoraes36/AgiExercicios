package ExerciciosJava_02;

import java.util.Scanner;

public class Exercicio_08_DescontoLoja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saiba quanto voce ira receber de desconto na sua compra!!");
        System.out.println("Digite o valor da sua compra:");
        double valorCompra = sc.nextDouble();

        if (valorCompra <= 500.00 && valorCompra > 0){
            System.out.println("Recebeu o valor de 5% de desconto na sua compra de: " + valorCompra);
            double desconto = valorCompra * 0.05;
            System.out.printf("\n Seu desconto foi de: %.2f " , desconto);
            System.out.println(" Sua compra ficou com o valor de: " + (valorCompra - desconto));
        } else if (valorCompra >= 501.00 && valorCompra < 999.99){
            System.out.println("Recebeu o valor de 10% de desconto!!");
            double desconto = valorCompra * 0.10;
            System.out.printf("\n Seu desconto foi de: %.2f" , desconto);
            System.out.println(" Sua compra ficou com o valor de: " + (valorCompra - desconto));
        } else if (valorCompra > 1000.00) {
            System.out.println("Recebeu o valor de 12% de desconto na sua compra de: " + valorCompra);
            double desconto = valorCompra * 0.12;
            System.out.printf("\n Seu desconto foi de: %.2f " , desconto);
            System.out.println(" Sua compra ficou com o valor de: " + (valorCompra - desconto));

        }else{
            System.out.println("Não foi possivel aplicar o desconto!!");
        }


    }
}
