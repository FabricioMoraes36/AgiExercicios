package ExerciciosJava_02;
import java.util.Scanner;

public class Exercicio_11_CaixaEletronico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Caixa Eletronico");
        System.out.println("Digite o seu saldo atual:");
        double saldo = sc.nextDouble();
        int opcao = -1;
        if (saldo > 0){

        while(opcao != 0){
            System.out.println("Escolha um dos nossos servicos!!");
            System.out.println("1 - sacar dinheiro");
            System.out.println("2 - consultar saldo");
            System.out.println("0 - sair");
            opcao = sc.nextInt();
            if (saldo <= 0){
                System.out.println("Conta zerada");
                break;
            }


            switch (opcao){
                case 1:

                    System.out.println("Quanto deseja sacar?");
                    double saque = sc.nextDouble();
                    saldo -= saque;
                    System.out.println("Seu saldo atual é de: " + saldo);
                    if (saldo <= 0){
                        System.out.println("Conta zerada");
                        return;
                    }
                    break;
                    case 2:
                        System.out.println("Seu saldo atual é de: " + saldo);
                        break;
                case 0:
                    System.out.println("Finalizando...");
                    break;
                    default:
                        System.out.println("Escolha uma opção valida!!");
                        break;
            }
        }

    }else{
            System.out.println("saldo insuficiente!");
        }
}
}
