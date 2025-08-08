package exerciciosJava2;

import java.util.Scanner;

public class Satisfacao_2 {
    public static void main(String[] args) {
        /*2.
Um banco precisa de uma ferramenta para avaliar o nível de satisfação dos clientes em relação ao atendimento recebido.
Desenvolva um programa que receba uma nota entre 0 e 5 e mostre uma mensagem correspondente à avaliação informada.*/

        Scanner sc = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("Pesquisa de satisfação do banco!!");
            System.out.println("\n De acordo com a sua nota poderemos imprimir o feedback que entendemos estar relacionado a sua nota sobre o atendimento ok?");
            System.out.println("Lembrando que as notas vão de 1 até 5!!");
            System.out.println("\nDigite o numero da sua nota ou digite 0 para encerrar o programa!!");
            opcao = sc.nextInt();
            if (opcao == 0) {
                System.out.println("Finalizando o menu de avaliação...");
            }

            switch (opcao) {
                case 1:
                    System.out.println("Ainda há muito o que melhorar no nosso banco mas estamos fazendo o nosso maximo para atender as expectativas");
                    break;
                    case 2:
                        System.out.println("Aos poucos estamos melhorando e arrumando alguns detalhes para satisfazer cada cliente");
                        break;
                        case 3:
                            System.out.println("Buscamos sempre o melhor para cada caso dos nossos clientes");
                            break;
                            case 4:
                                System.out.println("Estamos seguindo em um otimo caminho mas existem pontos que merecem atenção!!");
                                break;
                                case 5:
                                    System.out.println("Nosso nivel está muito acima do esperado mas iremos trabalhar para surpreender ainda mais os nossos clientes!");
                                    break;
                default:
                    System.out.println("Digite uma opção valida!!");
                                break;
            }
        }
    }
}
