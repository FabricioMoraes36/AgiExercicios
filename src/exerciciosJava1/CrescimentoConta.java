package exerciciosJava1;

import java.util.Scanner;

public class CrescimentoConta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o salo da sua conta:");
        double saldo = sc.nextDouble();
        System.out.println("Digite o valor dos depositos fixos que ira manter nos proximos 12 meses:");
        double deposito = sc.nextDouble();

        for (int i = 1; i <= 12; i++) {
            saldo = saldo + deposito;
            saldo = saldo * (1 + 0.005);
            String valorFormatado = String.format("%.2f", saldo);
           System.out.println("Mês " + i +" Rendimento atual: " +  valorFormatado);

            if (i == 12){
                System.out.println("Saldo final: " + valorFormatado);
            }
        }
    }
}
