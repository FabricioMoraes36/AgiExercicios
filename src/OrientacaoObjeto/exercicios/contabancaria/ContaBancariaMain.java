package OrientacaoObjeto.exercicios.contabancaria;

import java.util.Scanner;

public class ContaBancariaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String titular,numeroConta;
        double saldo;
        double valor;
        System.out.println("Digite o nome do titular da conta: ");
        titular = sc.nextLine();
        System.out.println("Agora digite o numero da sua conta");
        numeroConta = sc.nextLine();
        System.out.println("Agora digite seu saldo atual:");
        saldo = sc.nextDouble();
        ContaBancaria conta = new ContaBancaria(titular,numeroConta,saldo);


        if (saldo <= 0){
        System.out.println("Digite quanto você quer adicionar na sua conta:");
        valor = sc.nextDouble();
        conta.saldo = conta.saldo + valor;
        conta.exibirSaldo();
    }
        if (saldo > 0){
            System.out.println("Você tem " + conta.saldo);
            System.out.println("Quanto deseja sacar ?");
            valor = sc.nextDouble();
            if (valor > saldo){
                System.out.println("Você n tem saldo suficiente pra esse saque!!");
            }
            conta.saldo = conta.saldo - valor;
            conta.exibirSaldo();

        }
    }
}
