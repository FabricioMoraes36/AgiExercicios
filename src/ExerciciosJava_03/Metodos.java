package ExerciciosJava_03;

import java.util.Scanner;

public class Metodos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Conta bancaria");
        System.out.println("Digite seu nome:");

        System.out.println("Digite seu cpf");
        System.out.println("Digite seu saldo");
        Conta conta1 = new Conta(sc.nextLine(),sc.nextDouble(),sc.nextLine());




        System.out.println("Escolha uma opção:");
        System.out.println("1 - saque");
        System.out.println("2 - deposito");
        System.out.println("3 - consulta saldo");
        System.out.println("0 - encerrar o programa");
    }
}
