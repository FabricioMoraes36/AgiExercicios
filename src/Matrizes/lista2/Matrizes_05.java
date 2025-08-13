package Matrizes.lista2;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

//5. Simulação de Juros Compostos Mensais
//Uma matriz double[C][M] armazena os saldos mensais de C clientes, considerando juros compostos.
//Métodos a implementar:
//double calcularJurosMensal(double saldoAnterior, double saldoAtual) – retorna a taxa de juros mensal implícita.
//
//
//double[] jurosMediosClientes(double[][] saldos) – retorna a média de juros mensais de cada cliente.
public class Matrizes_05 {
    public static double calcularJurosMensal(double saldoAnterior, double saldoAtual){
        double juros = 0;
        double calculoJuros = ((saldoAtual / saldoAnterior) - 1) * 100;
        return calculoJuros;
    }

    public static double[] jurosMedioCliente(double[][]matriz){
        double calculo = 0;
        double media = 0;
        double[] medias = new double[matriz.length];
        for (int i = 0; i < matriz.length ; i++) {
            calculo = 0;
            for (int j = 0; j < matriz[i].length - 1; j++) {
                calculo += calcularJurosMensal(matriz[i][j], matriz[i][j + 1]);
            }
            media = calculo/(matriz[i].length - 1);
            medias[i] = media;

        }
        return medias;
    }

    public static void main(String[] args) {
        double[][] saldos = {
                {1000.00, 1050.00, 1102.50},//0
                {2000.00, 2040.00, 2080.80},//1
                {1500.00, 1575.00, 1653.75} //2
        };
        System.out.print("Calculo juros do primeiro mes com o ultimo:");
        System.out.printf("\n %.1f",calcularJurosMensal(saldos[0][0], saldos[0][1]));
        System.out.println("\nCalculo juros medio por cliente");
        double[] medias = jurosMedioCliente(saldos);
        for (int i = 0; i < medias.length ;i++) {
            System.out.printf("Cliente %d: %.2f%%\n",i,medias[i]);

        }
    }

}
