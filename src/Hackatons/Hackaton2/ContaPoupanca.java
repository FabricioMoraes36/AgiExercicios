package Hackatons.Hackaton2;

public class ContaPoupanca extends Conta {

    //construtor sem argumentos
    public ContaPoupanca() {
    }

//construtor com todos os argumentos
    public ContaPoupanca(String numeroConta, Cliente titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    //Sobreescrita do metodo abstrato da classe mae,na conta poupança ele tem um corpo diferente da conta corrente
    //na poupança o juros é aplicado,já na corrente so retorna uma mensagem pro usuario
    @Override
    public void aplicarJuros() {
        System.out.println("A poupança tem uma taxa de rendimento de 1%");
        System.out.println("O seu saldo anterior era:" + getSaldo());
        double valor = getSaldo() * 0.001;
        System.out.println("Aplicando o juros na sua conta seu saldo vai para:" + valor);

    }
}
