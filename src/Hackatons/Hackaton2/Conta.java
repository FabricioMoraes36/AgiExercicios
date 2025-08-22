package Hackatons.Hackaton2;

public abstract class Conta implements  OpBancarias{

    //atributos//

    private String numeroConta;
    private Cliente cliente;
    private double saldo;

    //Construtores
    public Conta() {
    }


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


    //METODOS

    //metodo de deposito
    @Override
    public void depositar(double valor) {
        if (valor <= 0){
            System.out.println("Digite um valor valido para o deposito!!");
        }else {
            System.out.println("Depositando um valor de: " + valor);
            setSaldo(getSaldo() + valor);
            System.out.println("Seu saldo atual: " + getSaldo());
        }
    }
    //metodo de saque
    @Override
    public void sacar(double valor) {

        if (valor <= 0) {
            System.out.println("Valor inválido para saque.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            System.out.println("Sacando um valor de: " + valor);
            setSaldo(getSaldo() - valor);
            System.out.println("Seu saldo ficou em: " + getSaldo());
        }

    }

//metodo abstrato que será usado pelas classes filhas

    public abstract void aplicarJuros();
}
