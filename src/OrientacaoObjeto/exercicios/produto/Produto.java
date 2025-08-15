package OrientacaoObjeto.exercicios.produto;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void adicionarAoEstoque(int quantidade){
        System.out.println("Quer adicionar "+ quantidade + " ao estoque:");

    }
    public void removerDoEstoque(int quantidade){
        System.out.println("Quer remover " + quantidade + " do estoque");

    }
    public void exibirDados(){
        System.out.println("O produto: " + this.nome);
        System.out.println("Custa: " + this.preco);
        System.out.println("E atualmente temos " + this.quantidade + " no estoque");
    }
}
