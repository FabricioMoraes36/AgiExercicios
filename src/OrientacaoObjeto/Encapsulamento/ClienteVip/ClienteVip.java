package OrientacaoObjeto.Encapsulamento.ClienteVip;

public class ClienteVip {
    private String nome;
    private String cpf;
    private double limiteCredito;

    public ClienteVip() {
    }

    public ClienteVip(String nome, String cpf, double limiteCredito) {
        this.nome = nome;
        this.cpf = cpf;
        this.limiteCredito = limiteCredito;
    }

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

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        if (limiteCredito >= 1.000 && limiteCredito <= 100000) {
            this.limiteCredito = limiteCredito;
        }

    }

    public void exibirCliente() {
        System.out.println("O clinete: " + getNome());
        System.out.println("Do cpf " + getCpf());
        if (limiteCredito >= 1000 && limiteCredito <= 100000) {
            System.out.println("Cliente VIP com credito: " + limiteCredito);
        } else {
            System.out.println("O cliente não é vip...sai fora pobre");
        }
    }
}
