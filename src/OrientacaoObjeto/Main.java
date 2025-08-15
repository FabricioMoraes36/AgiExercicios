package OrientacaoObjeto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String marca,modelo,ano,motor;
        System.out.println("Digite a marca do seu carro:");
        marca = sc.nextLine();
        System.out.println("Digite o modelo");
        modelo = sc.nextLine();
        System.out.println("Digite o ano do carro");
        ano = sc.nextLine();
        System.out.println("Digite o motor do carro");
        motor = sc.nextLine();
        Carro ferrari = new Carro(marca,modelo,ano, motor);
        ferrari.info();
    }
}
