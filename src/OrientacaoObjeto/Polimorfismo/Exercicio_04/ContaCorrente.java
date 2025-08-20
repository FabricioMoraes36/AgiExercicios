package OrientacaoObjeto.Polimorfismo.Exercicio_04;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente() {
    }

    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public void gerarRelatorio() {
        System.out.println("Relatorio conta Poupança!! Lembrando da taxa de R$ 20,00");
        System.out.println("Titular: " + getTitular());
        System.out.println("Seu saldo estava em: " + getSaldo());
        double desconto = getSaldo() - 20;
        System.out.println("Seu saldo está em: " + desconto);
        System.out.println("-----");
    }
}
