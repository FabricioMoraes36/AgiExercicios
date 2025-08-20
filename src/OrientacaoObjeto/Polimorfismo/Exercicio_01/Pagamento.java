package OrientacaoObjeto.Polimorfismo.Exercicio_01;

public class Pagamento {

    private double valor;

    public Pagamento() {
    }

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void processarPagamento(){
        System.out.println("Processando pagamento genérico");
    }
}
