package Hackatons.Hackaton2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        //Uso do scanner para criar o Objeto da classe Cliente e os Objetos das classes ContaCorrente e ContaPoupanca
        Scanner sc = new Scanner(System.in);


        //Variaveis para criar o cliente
        String nome, cpf;

        //Variaveis pra criar as contas
        String numeroConta;
        Cliente cliente;
        double saldo;
        int opcao = -1;

//Primeiro menu responsavel por criar o objeto Cliente

        System.out.println("|  Bem vindo ao AgiBasics - sua Conta Poupança ou Corrente!!  |");
        System.out.println("---Vamos começar Digitando o seu nome caro cliente--- ");
        nome = sc.nextLine();
        System.out.println("Perfeito!! agora digite o seu cpf por favor...");
        cpf = sc.nextLine();
        cliente = new Cliente(nome, cpf);

        //Menu para o usuario escolher qual conta deseja criar ou encerrar o app

        while (opcao != 0) {
            System.out.println("Seja bem vindo ao agiBasics " + nome + " !!");
            System.out.println("Agora escolha uma opção: 1- conta corrente🏧 | 2 - Conta Poupança💹 | 0 - encerrar o AgiBasics(Já vai?...) 😥");
            opcao = sc.nextInt();
            switch (opcao) {

                //case 1 cria conta corrente
                case 1:
                    System.out.println("Perfeito!! Vamos criar uma conta corrente");
                    System.out.println("Digite o numero da sua conta:");
                    numeroConta = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Digite seu saldo!");
                    saldo = sc.nextDouble();
                    //O tipo do objeto inicia como Conta
                    //mas sera um new ContCorrente pq ContaCorrente esta sobre o "guarda-chuva" do pai
                    ContaCorrente corrente = new ContaCorrente(numeroConta, cliente, saldo);
                    int opcaoCorrente = -1;


                    //Menu de movimentações na conta corrente
                    while (opcaoCorrente != 0) {
                        System.out.println("Agora escolha uma opção movimentar sua conta: ");
                        System.out.println("1 - sacar➖ | 2 - Depositar➕ | 3 - juros📈(não se aplica ok!) | 0 - Encerrar o AgiBasics😨");
                        opcaoCorrente = sc.nextInt();

                        //switch para cada escolha de movimentação
                        switch (opcaoCorrente) {
                            case 1:
                                System.out.println("Quanto deseja sacar ? seu saldo atual é de: " + saldo);
                                double valor = sc.nextDouble();
                                corrente.sacar(valor);
                                break;
                            case 2:
                                System.out.println("Quanto deseja adicionar na sua conta");
                                double valorAdicionado = sc.nextDouble();
                                corrente.depositar(valorAdicionado);
                                break;
                            case 3:
                                corrente.aplicarJuros();
                                break;
                            case 0:
                                System.out.println("Encerrando menu da sua conta corrente...");
                                break;
                            default:
                                System.out.println("Escolha uma opção valida ");
                                break;
                        }
                    }
                    break;

                    //case 2 cria conta poupança
                case 2:
                    System.out.println("Maravilhoso!! Vamos criar uma conta Poupança");
                    System.out.println("Digite o numero da sua conta:");
                    numeroConta = sc.nextLine();
                    sc.next();
                    System.out.println("Digite seu saldo!");
                    saldo = sc.nextDouble();
                    ContaPoupanca poupanca = new ContaPoupanca(numeroConta, cliente, saldo);
                    int opcaoPoupanca = -1;

                    //Menu de movimentações na conta poupança
                    while (opcaoPoupanca != 0) {
                        System.out.println("Agora escolha uma opção movimentar sua conta: ");
                        System.out.println("1 - sacar➖ | 2 - Depositar➕ | 3 - juros📈 | 0 - Encerrar o AgiBasics😨");
                        opcaoPoupanca = sc.nextInt();

                        //switch para cada movimentação
                        switch (opcaoPoupanca) {
                            //saque
                            case 1:
                                System.out.println("Quanto deseja sacar da sua conta");
                                double valor = sc.nextDouble();
                                poupanca.sacar(valor);
                                break;

                                //deposito
                            case 2:
                                System.out.println("Quanto deseja adicionar na sua conta");
                                double valorAdicionado = sc.nextDouble();
                                poupanca.depositar(valorAdicionado);
                                break;

                                //aplica o juros
                            case 3:
                                poupanca.aplicarJuros();
                                break;

                                //encerra a conta
                            case 0:
                                System.out.println("Encerrando menu da sua conta poupança...");
                                opcao=0;
                                break;
                                //default para o usuario digitar uma opção valida
                            default:
                                System.out.println("Escolha uma opção valida ");
                                break;
                        }
                    }

                    //case 0 do menu inicial para caso o usuario desista de criar a conta
                case 0:
                    System.out.println("Encerrando...");
                    break;

                    //default para ele escolher uma opção valida no menu inicial
                default:
                    System.out.println("Escolha uma opção valida!!");
                    break;
            }


        }
    }
}