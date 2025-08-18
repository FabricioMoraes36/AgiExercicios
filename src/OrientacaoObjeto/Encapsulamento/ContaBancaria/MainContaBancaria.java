package OrientacaoObjeto.Encapsulamento.ContaBancaria;

public class MainContaBancaria {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria("Predo","1001",100);
    contaBancaria.sacar(10);
    contaBancaria.exibirExtrato();

    }
}
