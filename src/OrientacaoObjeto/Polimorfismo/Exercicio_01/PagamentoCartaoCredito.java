package OrientacaoObjeto.Polimorfismo.Exercicio_01;

public class PagamentoCartaoCredito extends Pagamento {
    private String numeroCartao;

    public PagamentoCartaoCredito() {
    }

    public PagamentoCartaoCredito(double valor, String numeroCartao) {
        super(valor);
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via cartão de numero:" + numeroCartao);
    }
}
