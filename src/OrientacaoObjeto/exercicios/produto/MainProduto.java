package OrientacaoObjeto.exercicios.produto;

import java.util.Scanner;

public class MainProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int quantidade;
        double preco;
        int add;
        int remover;
        System.out.println("Digite o nome do produto:");
        nome = sc.nextLine();
        System.out.println("Digite a quantidade do produto " + nome);
        quantidade = sc.nextInt();
        System.out.println("Digite o valor do " + nome);
        preco = sc.nextDouble();

        Produto p1 = new Produto(nome,preco,quantidade);

if (p1.quantidade <= 0) {
    System.out.println("Digite quanto quer adicionar ao estoque: ");
    add = sc.nextInt();
    p1.quantidade = p1.quantidade += add;
    System.out.println();
    p1.adicionarAoEstoque(p1.quantidade);
}
if (p1.quantidade > 0) {
    System.out.println("Digite quanto voce quer remover");
    remover = sc.nextInt();
    p1.quantidade = p1.quantidade - remover;
    p1.removerDoEstoque(p1.quantidade);
}

    }
}
