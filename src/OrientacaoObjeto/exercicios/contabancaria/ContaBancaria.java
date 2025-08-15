package OrientacaoObjeto.exercicios.contabancaria;

public class ContaBancaria {
    String titular;
    String numeroConta;
    double saldo;

    public ContaBancaria(String titular, String numeroConta, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void depositar(double valor){
     this.saldo = this.saldo + valor;
    }
    public void sacar(double valor){
        this.saldo = this.saldo - valor;
    }
    public void exibirSaldo(){
        System.out.println("Olá " + this.titular + " !!");
        System.out.println("Seu saldo atual é de: " + this.saldo);
    }


}
