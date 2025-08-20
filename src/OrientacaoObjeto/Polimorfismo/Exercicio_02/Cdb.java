package OrientacaoObjeto.Polimorfismo.Exercicio_02;

public class Cdb extends Investimento{
    public Cdb(double valorAplicado) {
        super(valorAplicado);
    }

    @Override
    public void calcularRendimento() {
            System.out.println("Com o investimento na poupança o retorno será de 0.5%");
            double resultado = getValorAplicado() * 0.01;

        System.out.println("E o rendimento será de: " + resultado);
        }
}
