package OrientacaoObjeto.Polimorfismo.Exercicio_03;

public class Emprestimo {
    private double valorEmprestado;

    public Emprestimo() {
    }

    public Emprestimo(double valorEmprestado) {
        this.valorEmprestado = valorEmprestado;
    }

    public double getValorEmprestado() {
        return valorEmprestado;
    }

    public void setValorEmprestado(double valorEmprestado) {
        this.valorEmprestado = valorEmprestado;
    }

    public void calcularParcela(int meses){
        double resultado = valorEmprestado / meses;
        System.out.printf("Simulando um emprestimo neutro: %.2f ", resultado);
        System.out.println("-----");

    }
}
