package OrientacaoObjeto.Polimorfismo.Exercicio_02;

public class Poupanca extends  Investimento{
    public Poupanca(double valorAplicado) {
        super(valorAplicado);
    }

    @Override
    public void calcularRendimento() {
        System.out.println("Com o investimento na poupança o retorno será de 0.5%");
        double resultado = getValorAplicado() * 0.005;
        System.out.println("E o rendimento será de: " + resultado);
    }
}
