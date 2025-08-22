package Hackatons.Hackaton2_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //variaveis de apoio para criação dos objetos
        String nome,email;
        String codigoProduto,nomeProduto;
        double precoProduto;

        //Chamada dos metodos

        System.out.println("--Bem vindo a AgiCompras--");
        System.out.println("Digite seu nome para irmos as compras");
        nome = sc.nextLine();
        System.out.println("Agora digite seu Email: ");
        email = sc.nextLine();
        Cliente cliente = new Cliente(nome,email);
        System.out.println("Otimo " + cliente.getNome() + " Vamos começar as compras!!");
        int opcao = -1;
        while(opcao != 0){
            System.out.println("1 - Comprar produto fisico | 2 - Comprar produto digital | 0 - Encerrar...");
            opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Ok vamos aos produtos fisicos!!");
                    System.out.println("Digite o codigo do produto:");
                    codigoProduto = sc.nextLine();
                    sc.next();
                    System.out.println("Agora o nome do produto: ");
                    nomeProduto = sc.nextLine();
                    sc.nextLine();
                    System.out.println("E qual o preço do produto: ");
                    precoProduto = sc.nextDouble();
                    ProdutoFisico produtoFisico = new ProdutoFisico(codigoProduto,nomeProduto,precoProduto,cliente);
                    System.out.println("--------------------------------------------------");
                    System.out.println("| Informações da compra |");
                    System.out.println("\n O seu produto terá um desconto meu caro(a) " + cliente.getNome()  + "😁!!");
                    produtoFisico.aplicarDesconto(0.005);
                    System.out.println("\n Mas infelizmente logo ele terá um aumento 😢");
                    produtoFisico.aumentarPreco(0.005);
                    System.out.println("\n Agora falando sobre o frete do produto...");
                    produtoFisico.calcularFrete();
                    System.out.println("--------------------------------------------------");

                    break;

                case 2:
                    System.out.println("Ok vamos aos produtos digitais!!");
                    System.out.println("Digite o codigo do produto:");
                    codigoProduto = sc.nextLine();
                    sc.next();
                    System.out.println("Agora o nome do produto: ");
                    nomeProduto = sc.nextLine();
                    sc.nextLine();
                    System.out.println("E qual o preço do produto: ");
                    precoProduto = sc.nextDouble();
                    ProdutoDigital produtoDigital = new ProdutoDigital(codigoProduto,nomeProduto,precoProduto,cliente);
                    System.out.println("--------------------------------------------------");
                    System.out.println("| Informações da compra |");
                    System.out.println("\n O seu produto terá um desconto meu caro(a) " + cliente.getNome()  + "😁!!");
                    produtoDigital.aplicarDesconto(0.005);

                    System.out.println("\n Mas infelizmente logo ele terá um aumento 😢");
                    produtoDigital.aumentarPreco(0.005);
                    System.out.println("\n Agora falando sobre o frete do produto...");
                    produtoDigital.calcularFrete();
                    System.out.println("--------------------------------------------------");


                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Escolha uma opção valida...");
                    break;
            }
        }

    }
}
