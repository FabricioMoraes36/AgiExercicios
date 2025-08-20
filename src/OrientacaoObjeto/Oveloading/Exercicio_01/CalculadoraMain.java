package OrientacaoObjeto.Oveloading.Exercicio_01;

public class CalculadoraMain {
    public static void main(String[] args) {
        CalculadoraDeJuros calculo = new CalculadoraDeJuros(1000,0.5,10);

        calculo.Calculo(calculo.getCapital(), calculo.getTaxaJuros(), calculo.getTempoEmMeses());
        calculo.Calculo(1000,1.5);
        calculo.Calculo(1000,1.4,5);

    }
}
