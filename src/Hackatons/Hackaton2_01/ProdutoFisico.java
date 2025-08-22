package Hackatons.Hackaton2_01;

public class ProdutoFisico extends Produto{

    //Construtores

    public ProdutoFisico() {
    }

    public ProdutoFisico(String codigo, String nome, double preco, Cliente cliente) {
        super(codigo, nome, preco, cliente);
    }

    //Metodos

    @Override
    public void calcularFrete() {
        System.out.println("O valor fixo do seu frete é de 20R$");
        System.out.println("Somando o frete e o preço do seu produto o total ficará em: ");
        setPreco(getPreco() + 20);
        System.out.println(getPreco());
    }
}
