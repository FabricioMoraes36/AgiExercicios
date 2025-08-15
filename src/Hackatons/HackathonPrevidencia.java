package Hackatons;
import java.util.Arrays;
import java.util.Scanner;
    public class HackathonPrevidencia {
        // 1. Método para calcular o saldo acumulado ano a ano e devolver no formato de vetor
        public static double[] calcularSaldoAnual(int idadeAtual, int idadeAposentadoria, double contribuicaoMensal, double taxaAnual) {
            // Aqui você faz a conta do saldo de cada ano até a aposentadoria e retorna no vetor
            int anos = idadeAposentadoria - idadeAtual;
            double[] saldo = new double[anos];
            double saldoAnual = 0;
            for (int i = 0; i < anos; i++) {

                double taxaMensal = taxaAnual / 12;
                double calculoAnual = contribuicaoMensal * (Math.pow(1 + taxaMensal, 12) - 1) / taxaMensal;
                saldoAnual += calculoAnual;
                saldo[i] = saldoAnual;
            }
            return saldo;
        }

        // 2. Método para gerar uma matriz de cenários com diferentes taxas de rendimento
        public static double[][] gerarMatrizCenarios(int idadeAtual, int idadeAposentadoria, double contribuicaoMensal, double[] taxasAnuais) {
            // Aqui você calcula o saldo para cada taxa e monta a matriz
            int anos = idadeAposentadoria - idadeAtual;
            double[][] saldo = new double[taxasAnuais.length][anos];
            for (int i = 0; i < taxasAnuais.length; i++) {
                double saldoAnual = 0;
                for (int j = 0; j < anos; j++) {
                    double taxaMensal = taxasAnuais[i] / 12;
                    double calculoAnual = contribuicaoMensal * (Math.pow(1 + taxaMensal, 12) - 1) / taxaMensal;
                    saldoAnual += calculoAnual;
                    saldo[i][j] = saldoAnual;
                }

            }
            return saldo;
        }


        // 3. Método para calcular a renda mensal que a pessoa teria em cada cenário
        public static double[] calcularRendaMensal(double[][] matrizCenarios, double[] taxasAnuais, int expectativaVida, int idadeAtual, int idadeAposentadoria, double contribuicaoMensal) {
            // Aqui você divide o valor acumulado pela quantidade de meses de expectativa de vida para achar a renda mensal
            double[][] matriz = gerarMatrizCenarios(idadeAtual, idadeAposentadoria, contribuicaoMensal, taxasAnuais);
            double calculo = 0;
            double[] vetor = new double[matriz.length];
            for (int i = 0; i < matriz.length; i++) {
                calculo = (matriz[i][matriz[i].length - 1]) / ((expectativaVida - idadeAposentadoria) * 12);
                vetor[i] = calculo;
            }

            return vetor;
        }

        // 4. Método para mostrar todos os resultados na tela
        public static void exibirResultados(double[] saldoAnual, double[][] matrizCenarios, double[] taxasAnuais, double[] rendaMensal) {
            // Aqui você imprime o saldo, a matriz de cenários, as taxas e as rendas mensais
            System.out.println("Saldo anual: " + saldoAnual);
            System.out.println("\n");
            for (int i = 0; i < matrizCenarios.length; i++) {
                for (int j = 0; j < matrizCenarios[i].length; j++) {
                    System.out.println("Taxa: " + i + " no ano:" + j + " ira render: " + matrizCenarios[i][j]);
                }

            }
            System.out.println("\n");
            System.out.println("A renda mensal pensando em cada taxa seria: " + rendaMensal);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int opcao;

            // Variáveis principais que vão guardar os dados que o usuário informar
            int idadeAtual = 0, idadeAposentadoria = 0, expectativaVida = 0;
            double contribuicaoMensal = 0;
            double[] taxasAnuais = new double[3]; // Lista de taxas que serão usadas nos cálculos
            double[] saldoAnual = null;  // Vetor com saldo acumulado ano a ano
            double[][] matrizCenarios = null; // Matriz com cenários diferentes
            double[] rendaMensal = null; // Quanto receberá por mês na aposentadoria
            double taxaAnualUnica = 0;

            do {
                System.out.println("\n===== MENU SIMULADOR DE PREVIDÊNCIA =====");
                System.out.println("1 - Inserir dados");
                System.out.println("2 - Calcular saldo anual (vetor)");
                System.out.println("3 - Gerar matriz de cenários");
                System.out.println("4 - Calcular renda mensal na aposentadoria");
                System.out.println("5 - Exibir todos os resultados");
                System.out.println("0 - Sair");
                System.out.print("Escolha uma opção: ");
                opcao = sc.nextInt();

                switch (opcao) {
                    case 1:
                        // Aqui você lê as informações do usuário (idade, contribuição, etc.) e guarda nas variáveis acima]
                        System.out.println("Digite a sua idade:");
                        idadeAtual = sc.nextInt();
                        System.out.println("Digite com quantos anos deseja se aposentar:");
                        idadeAposentadoria = sc.nextInt();
                        System.out.println("E agora uma pergunta cruel mas...qual sua expectativa de vida ?");
                        expectativaVida = sc.nextInt();
                        System.out.println("Digite quanto irá contribuir mensalmente:");
                        contribuicaoMensal = sc.nextDouble();
                        System.out.println("Agora digite uma taxa para simular:");
                        taxaAnualUnica = sc.nextDouble();
                        break;

                    case 2:
                        // Aqui chama o método calcularSaldoAnual() e guarda o resultado no vetor saldoAnual
                        saldoAnual = calcularSaldoAnual(idadeAtual,idadeAposentadoria,contribuicaoMensal,taxaAnualUnica);
                        break;

                    case 3:
                        // Aqui chama o método gerarMatrizCenarios() e guarda o resultado na matriz matrizCenarios
                        System.out.println("Você pode simular com até 3 taxas diferentes");
                        for (int i = 0; i < 3; i++) {
                            System.out.println("Digite a taxa: ");
                            taxasAnuais[i] =  sc.nextDouble();
                        }
                        matrizCenarios = gerarMatrizCenarios(idadeAtual,idadeAposentadoria,contribuicaoMensal,taxasAnuais);
                        break;

                    case 4:
                        // Aqui chama o método calcularRendaMensal() e guarda o resultado no vetor rendaMensal
                        rendaMensal = calcularRendaMensal(matrizCenarios,taxasAnuais,expectativaVida,idadeAtual,idadeAposentadoria,contribuicaoMensal);
                        break;

                    case 5:
                        // Saldo anual
                        System.out.println("Saldo anual:");
                        for (int i = 0; i < saldoAnual.length; i++) {
                            System.out.printf("Ano %d: %.2f |\n", i + 1, saldoAnual[i]);
                        }

// Matriz de cenários
                        System.out.println("\nCenários com diferentes taxas:");
                        for (int i = 0; i < matrizCenarios.length; i++) {
                            System.out.printf("Taxa %d: ", i + 1);
                            for (int j = 0; j < matrizCenarios[i].length; j++) {
                                System.out.printf("%.2f | ", matrizCenarios[i][j]);
                            }
                            System.out.println(); // Pula para a próxima linha de cenário
                        }

// Renda mensal
                        System.out.println("\nRenda mensal de acordo com cada taxa:");
                        for (int i = 0; i < rendaMensal.length; i++) {
                            System.out.printf("Taxa %d: %.2f |\n", i + 1, rendaMensal[i]);
                        }
                        // Aqui chama o método exibirResultados() para mostrar todos os dados calculados
                        break;

                    case 0:
                        System.out.println("Encerrando o sistema...");
                        break;

                    default:
                        System.out.println("⚠ Opção inválida. Tente novamente.");
                }
            } while (opcao != 0);

            sc.close();
        }
    }





