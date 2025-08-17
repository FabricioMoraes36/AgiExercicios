package Hackatons.Hackaton2;

public class Cliente {
//atributos
    private String nome;
    private String cpf;
//construtor sem argumentos para poder criar um cliente na main
    public Cliente() {
    }
//construtor com todos os argumentos para criar um cliente
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
//getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
