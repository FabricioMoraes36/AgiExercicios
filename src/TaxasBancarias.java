import java.util.Scanner;

public class TaxasBancarias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da sua conta bancaria:");
        double saldo = sc.nextDouble();
        double taxaManutencao = saldo * 0.01;
        if (taxaManutencao < 10){
            taxaManutencao = 10;
            saldo = saldo - taxaManutencao;
            System.out.println("Por conta do seu saldo,a sua taxa ficou em: " + taxaManutencao + " que é o valor minimo para cada conta");
            System.out.println("E sua conta tem o saldo de: " + saldo + " Apos o desconto da taxa de manutenção padrão de R$ 10");
        }else{
            System.out.println("A taxa de manutenção da sua conta é:" + taxaManutencao);
            saldo = saldo - taxaManutencao;
            System.out.println("E sua conta tem o saldo de: " + saldo + " Apos o desconto da taxa de manutenção de " + taxaManutencao);
        }
    }
}
