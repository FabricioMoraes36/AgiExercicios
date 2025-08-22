package Hackatons.Hackaton2_01;

public class ProdutoDigital extends Produto{

    public ProdutoDigital() {
    }

    public ProdutoDigital(String codigo, String nome, double preco, Cliente cliente) {
        super(codigo, nome, preco, cliente);
    }

    @Override
    public void calcularFrete() {
        System.out.println("Seu produto é digital!! não há frete para ele");
    }
}
