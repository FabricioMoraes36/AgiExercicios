package OrientacaoObjeto;

public class Carro extends Veiculo{
    private String motor;

    public Carro(String marca,String modelo, String ano, String motor) {
        super(marca,modelo,ano);
        this.motor = motor;
    }

    public Carro() {

    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    @Override
    public void barulho() {
        System.out.println("tem um som diferenciado");

    }

    @Override
    public void info() {
        super.info();
        System.out.println("E o motor: " + getModelo()+ " é" + getMotor());
    }
}

