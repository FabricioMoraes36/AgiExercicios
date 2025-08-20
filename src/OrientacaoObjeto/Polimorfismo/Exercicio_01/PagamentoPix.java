package OrientacaoObjeto.Polimorfismo.Exercicio_01;

public class PagamentoPix extends Pagamento {
    private String chavePix;

    public PagamentoPix() {
    }

    public PagamentoPix(double valor, String numeroCartao) {
        super(valor);
        this.chavePix = numeroCartao;
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via pix para a chave: " + chavePix);

    }
}
