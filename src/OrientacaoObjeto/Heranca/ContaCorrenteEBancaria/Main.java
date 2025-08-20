package OrientacaoObjeto.Heranca.ContaCorrenteEBancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
ContaCorrente contaCorrente = new ContaCorrente("fabricio","2020",100,1200);
        System.out.println("Digite o saque");
double valor = scanner.nextDouble() ;

contaCorrente.sacarComChequeEspecial(valor);
    }
}
