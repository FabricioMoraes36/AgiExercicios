package OrientacaoObjeto.Heranca.Transferencia;

public class TransferenciaBancaria extends Transacao{
    private String contaOrigem;
    private String contaDestino;


    public TransferenciaBancaria(String contaOrigem, String contaDestino) {
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
    }

    public TransferenciaBancaria(String id, double valor, String data, String contaOrigem, String contaDestino) {
        super(id, valor, data);
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
    }

    public void resumoTransferencia(double valor){
        System.out.println("o valor: " + valor + " será enviado da conta: " + contaOrigem + " para a conta: " + contaDestino);
    }
}
