package OrientacaoObjeto.Polimorfismo.Exercicio_04;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca() {
    }

    public ContaPoupanca(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public void gerarRelatorio() {
        System.out.println("Relatorio conta poupança!! A cada mes ela rende 0.5%");
        System.out.println("titular: " + getTitular());
        System.out.println("Saldo inicial: " + getSaldo());
        double rendimento = getSaldo() * 0.005;
        System.out.println("Por mes com esse saldo ira ter o rendimento de: " + rendimento);
        System.out.println("Ou seja em um prazo de 12 meses você terá: " + rendimento * 12);
        System.out.println("-----");
    }
}
