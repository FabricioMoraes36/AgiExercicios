package OrientacaoObjeto.Encapsulamento.ContaBancaria;

public class ContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(String titular, String numeroConta, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double depositar(double valor){
        if (valor >= 1){
            System.out.println("O valor que você quer depositar é: " + valor);
            return this.saldo += valor;
        }else{
            System.out.println("Digita um valor valido para depositar!!");
            return saldo;
        }
    }
    public double sacar(double valor){
        if (valor <= saldo){
            System.out.println("Você que sacar o valor de : " + valor);
            return this.saldo -= valor;
        }else{
            System.out.println("Saldo insuficiente");
            return saldo;
        }
    }

public void exibirExtrato(){
    System.out.println("Titular da conta: " + getTitular());
    System.out.println("Da conta numero: " + numeroConta);
    System.out.println("O saldo da sua conta é: " + this.saldo);
}

}
