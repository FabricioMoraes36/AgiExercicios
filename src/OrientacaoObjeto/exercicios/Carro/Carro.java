package OrientacaoObjeto.exercicios.Carro;

import com.sun.security.jgss.GSSUtil;

public class Carro {
    String modelo;
    double consumoPorKm;

    public Carro(String modelo, double consumoPorKm) {
        this.modelo = modelo;
        this.consumoPorKm = consumoPorKm;
    }

    public double calcularConsumo(double distancia){
        double gastoFinal = consumoPorKm * distancia;
        System.out.printf("Fará na distancia: %.2f " , distancia , gastoFinal);
        return gastoFinal;
    }
    public void exibirDados(double distancia){
        System.out.println("O carro: " + modelo);
        System.out.println("Faz por km: " + consumoPorKm + " baseado na distancia fornecida o consumo será: " + calcularConsumo(distancia));


    }
}
