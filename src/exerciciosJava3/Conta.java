package exerciciosJava3;

public class Conta {
    private String nome;
    private String cpf;
    private double saldo;

    public Conta(String nome, double saldo, String cpf) {
        this.nome = nome;
        this.saldo = saldo;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double conversaoMoeda(double moeda1,double moeda2){
        return moeda1 / moeda2;
    }
}
