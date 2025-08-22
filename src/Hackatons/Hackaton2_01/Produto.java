package Hackatons.Hackaton2_01;

public abstract class Produto implements OperacoesProdutos {

    //Atributos

    private String codigo;
    private String nome;
    private double preco;
    private Cliente cliente;

    //Construtores

    public Produto() {
    }

    public Produto(String codigo, String nome, double preco, Cliente cliente) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.cliente = cliente;
    }
    //Getters e Setters

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    //Metodos

    @Override
    public void aplicarDesconto(double percentual) {
        double desconto = (getPreco() * percentual);
        double valorFinal= getPreco() - desconto;
        setPreco(valorFinal);
        System.out.println("Seu produto recebeu o desconto de: " + percentual + " porcento!! e ficou no valor de: " + getPreco());
    }

    @Override
    public void aumentarPreco(double percentual) {
        double aumento = getPreco() * percentual;
        double valorComAumento = getPreco() + percentual;
        setPreco(valorComAumento);
        System.out.println("O seu produto com o aumento de: " + percentual + " porcento!! fica no valor de: " + getPreco());

    }

    public abstract void calcularFrete();
}
