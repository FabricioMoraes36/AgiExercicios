package OrientacaoObjeto.Encapsulamento.TransacaoFinanceira;

public class Transacao {
    private String id;
    private String tipo;
    private double valor;

    public Transacao() {
        this.id="";
        this.tipo="";
        this.valor=0;
    }

    public Transacao(String id, String tipo, double valor) {
        this.id = id;
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
