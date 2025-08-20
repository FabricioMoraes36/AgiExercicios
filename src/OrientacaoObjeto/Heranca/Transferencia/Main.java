package OrientacaoObjeto.Heranca.Transferencia;

public class Main {
    public static void main(String[] args) {
        TransferenciaBancaria transferenciaBancaria = new TransferenciaBancaria("1",100,"10-10-2025","102543","102030");
        transferenciaBancaria.resumoTransferencia(100);
    }
}
