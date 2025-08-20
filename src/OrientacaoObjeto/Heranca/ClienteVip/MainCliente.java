package OrientacaoObjeto.Heranca.ClienteVip;

public class MainCliente {
    public static void main(String[] args) {
        ClienteVip clienteVip = new ClienteVip("maurin","32342441",4,0);
        clienteVip.calcularPrecoComDesconto(100);
    }
}
