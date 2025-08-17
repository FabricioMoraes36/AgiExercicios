package Hackatons.Hackaton2;

public class ContaCorrente extends Conta{

    //construtor sem argumentos para criar o objeto
    public ContaCorrente() {
    }

//construtor com todos os argumentos
    public ContaCorrente(String numeroConta, Cliente titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

//Conta corrente sobreescreve o metodo aplicarJuros e exibe somente uma mensagem

    @Override
    public void aplicarJuros() {
        System.out.println("Sua conta é corrente,então não há taxa de juros aplicada nela");
    }
}
