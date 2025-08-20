package OrientacaoObjeto.Heranca.Transferencia;

public class Transacao {
    private String id;
    private double valor;
    private String data;

    public Transacao() {
    }

    public Transacao(String id, double valor, String data) {
        this.id = id;
        this.valor = valor;
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
