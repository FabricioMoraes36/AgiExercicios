package ExerciciosJava_02;

import java.util.Scanner;

public class Exercicio_01_Investimentos {
    public static void main(String[] args) {
        /*1.
Um cliente deseja escolher entre
diferentes tipos de investimento: CDB, CDI, Tesouro Direto ou FII.
Crie um programa que permita ao usuário
selecionar uma das opções e exiba uma mensagem de acordo com a escolha feita.
        * */
        Scanner sc = new Scanner(System.in);
        int opcao = -1;
        int prazo;
        double valor;
        double taxaCdb = 0.89,taxaFii = 0.6,taxaTesouro = 0.47,taxaCdi = 0.81;
      while(opcao != 0) {
          System.out.println("Bem vindo aos seus possiveis investimentos");
          System.out.println("1. CDB");
          System.out.println("2. CDI");
          System.out.println("3. Tesouro direto");
          System.out.println("4. FII");
          System.out.println("0. Sair");
          opcao = sc.nextInt();

          switch (opcao) {
              case 1:
                  System.out.println("Investimento cdb");
                  System.out.println("Digite quanto deseja investir:");
                  valor = sc.nextDouble();
                  System.out.println("Digite em quantos meses deseja aplicar esse valor:");
                  prazo = sc.nextInt();
                  double cdb =+ Math.pow(valor * (1 + taxaCdb),prazo);
                  System.out.println("Ao final de " + prazo + " mes/meses " + " tera rendido: " + cdb);
                  break;
              case 2:
                  System.out.println("Investimento cdi");
                  System.out.println("Digite quanto deseja investir:");
                  valor = sc.nextDouble();
                  System.out.println("Digite em quantos meses deseja aplicar esse valor:");
                  prazo = sc.nextInt();
                  double cdi =+ Math.pow(valor * (1 + taxaCdi),prazo);
                  System.out.println("Ao final de " + prazo + " mes/meses " + " tera rendido: " + cdi);
                  break;
              case 3:
                  System.out.println("Investimento tesouro direto");
                  System.out.println("Digite quanto deseja investir:");
                  valor = sc.nextDouble();
                  System.out.println("Digite em quantos meses deseja aplicar esse valor:");
                  prazo = sc.nextInt();
                  double tesouro =+ Math.pow(valor * (1 + taxaTesouro),prazo);
                  System.out.println("Ao final de " + prazo + " mes/meses " + " tera rendido: " + tesouro);
                  break;
              case 4:
                  System.out.println("Investimento FII");
                  System.out.println("Digite quanto deseja investir:");
                  valor = sc.nextDouble();
                  System.out.println("Digite em quantos meses deseja aplicar esse valor:");
                  prazo = sc.nextInt();
                  double fii =+ Math.pow(valor * (1 + taxaFii),prazo);
                  System.out.println("Ao final de " + prazo + " mes/meses " + " tera rendido: " + fii);
                  break;
              default:
                  System.out.println("Digite uma opção valida");
                  break;
          }


      }
    }
}
