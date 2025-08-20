package OrientacaoObjeto.Polimorfismo.Exercicio_04;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void gerarRelatorio(){
        System.out.println("Relatorio generico...");
        System.out.println("-----");
    }
}
