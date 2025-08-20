package OrientacaoObjeto.Polimorfismo.Exercicio_02;

public class Investimento {
    private double valorAplicado;

    public Investimento() {
    }

    public Investimento(double valorAplicado) {
        this.valorAplicado = valorAplicado;
    }

    public double getValorAplicado() {
        return valorAplicado;
    }

    public void setValorAplicado(double valorAplicado) {
        this.valorAplicado = valorAplicado;
    }

    public void calcularRendimento(){
        System.out.println("Inicialmente não há retorno no investimento puro: " + 0);
    }
}
