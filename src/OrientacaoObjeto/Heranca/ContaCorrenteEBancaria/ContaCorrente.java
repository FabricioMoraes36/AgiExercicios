package OrientacaoObjeto.Heranca.ContaCorrenteEBancaria;

public class ContaCorrente extends ContaBancaria {
    private double limiteChequeespecial;


    public ContaCorrente(double limiteChequeespecial) {
        this.limiteChequeespecial = limiteChequeespecial;
    }

    public ContaCorrente(String titular, String numeroConta, double saldo, double limiteChequeespecial) {
        super(titular, numeroConta, saldo);
        this.limiteChequeespecial = limiteChequeespecial;
    }

    public void sacarComChequeEspecial(double valor){
        if (valor <= getSaldo()) {
            System.out.println("Você está sacando "+ valor );
            System.out.println("Como seu limite é de: " + getSaldo() + " Então não usaremos o cheque especial e vamos abater do limite");
            double resultado = getSaldo() - valor;
            System.out.println("Seu saldo ficou em: " + resultado);

        } else if (valor <= limiteChequeespecial) {

            System.out.println("Você está sacando " + valor);
            System.out.println("Voce tem de cheque especial: " + limiteChequeespecial);
            limiteChequeespecial = limiteChequeespecial - valor;
            System.out.println("Seu cheque especial ficou em: " + limiteChequeespecial);
        }else {
            System.out.println("Seu limite do cheque especial não permite");
        }
    }
}
