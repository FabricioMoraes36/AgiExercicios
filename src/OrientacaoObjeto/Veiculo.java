package OrientacaoObjeto;

public class Veiculo {
    private String marca;
    private String modelo;
    private String ano;

    public Veiculo() {
    }

    public Veiculo(String marca, String modelo, String ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public void nomeDoVeiculo(){
        System.out.println(getMarca());
    }
    public void barulho(){
        System.out.println("O barulho dos veiculos é a buzina");
    }
    public void info(){
        System.out.println("A marca do carro é: " + getMarca());
        System.out.println("O modelo do carro é: " + getModelo());
        System.out.println("O ano do veiculo é: " + getAno());
    }
}
