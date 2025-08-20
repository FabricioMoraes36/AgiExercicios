package Hackatons.Hackaton2;

public abstract class Conta implements  OpBancarias{
    //atributos
    private String numeroConta;
    private Cliente cliente;
    private double saldo;


//construtor sem argumentos para criar o objeto
    public Conta() {
    }


//construtor com todos os argumentos
    public Conta(String numeroConta, Cliente titular, double saldo) {
        this.numeroConta = numeroConta;
        this.cliente = new Cliente();
        this.saldo = saldo;
    }


//getters e setters
    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Cliente getTitular() {
        return cliente;
    }

    public void setTitular(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //metodos


    //metodo de deposito
    @Override
    public void depositar(double valor) {
        System.out.println("Depositando um valor de: " + valor);
        saldo = saldo + valor;
        System.out.println("Seu saldo atual: " + getSaldo());
    }
    @Override
    public void sacar(double valor) {

        if (valor <= 0) {
            System.out.println("Valor inválido para saque.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            System.out.println("Sacando um valor de: " + valor);
            saldo = saldo - valor;
            System.out.println("Seu saldo ficou em: " + getSaldo());
        }

    }

//metodo abstrato que será usado pelas classes filhas
    public abstract void aplicarJuros();


}
