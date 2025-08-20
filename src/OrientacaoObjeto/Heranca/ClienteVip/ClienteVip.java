package OrientacaoObjeto.Heranca.ClienteVip;

public class ClienteVip extends Cliente {
    private int nivel;
    private double descontoPercentual;

    public ClienteVip(String nome, String cpf, int nivel, double descontoPercentual) {
        super(nome, cpf);
        this.nivel = nivel;
        this.descontoPercentual = descontoPercentual;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public double getDescontoPercentual() {
        return descontoPercentual;
    }

    public void setDescontoPercentual(double descontoPercentual) {
        this.descontoPercentual = descontoPercentual;
    }
    public void calcularPrecoComDesconto(double preco){
        if (nivel >= 1 && nivel <= 3){
            System.out.println("Pelo seu nivel o desconto será de 5%");
            double desconto = (preco * 0.5)/100;
            preco -= desconto;
            System.out.println("o valor final do produto será: " + preco);
        }else{
            System.out.println("Voce n é vip e vai ter que pagar o preço integral " + preco);
        }
    }
}
