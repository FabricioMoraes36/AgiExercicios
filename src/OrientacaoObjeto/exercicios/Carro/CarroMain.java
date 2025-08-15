package OrientacaoObjeto.exercicios.Carro;

import java.util.Scanner;

public class CarroMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String modelo;
        double consumoPorKm;
        double distancia;
        double gastoFinal;

        System.out.println("Digite o modelo do carro: ");
        modelo = sc.nextLine();
        System.out.println("Digite quantos km o carro faz por litro");
        consumoPorKm = sc.nextDouble();
        System.out.println("Agora digite a distancia que você quer percorrer com o carro:");
        distancia = sc.nextDouble();

        Carro carro1 = new Carro(modelo,consumoPorKm);
        carro1.calcularConsumo(distancia);
        carro1.exibirDados(distancia);


    }
}
