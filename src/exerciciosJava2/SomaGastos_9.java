package exerciciosJava2;

import java.util.Scanner;

public class SomaGastos_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        double gastos = 0;
        while (true) {
            System.out.println("Digite 1 dos seus gastos:");
            gastos = scanner.nextDouble();
            if (gastos <= 0) {
                System.out.println("Encerrando o programa...");
                break;
            } else if (gastos > 0) {
            total = total + gastos;
                System.out.println("Total de gastos até o momento:" + total);
                if (total > 5000){
                    System.out.println("Fique esperto seus gastos estão altos demais");
                }
            }else{
                System.out.println("Total de gastos: " + total);
                System.out.println("Encerrando...");
                break;
            }
        }
    }
    }


