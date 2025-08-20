package OrientacaoObjeto.Polimorfismo.Exercicio_03;

public class EmprestimoPessoal extends Emprestimo{

    public EmprestimoPessoal() {
    }

    public EmprestimoPessoal(double valorEmprestado) {
        super(valorEmprestado);
    }

    @Override
    public void calcularParcela(int meses) {
        double resultado = (getValorEmprestado() * meses) * 0.02;
        System.out.printf("No emprestimo pessoal o valor será: %.2f" , resultado);
        System.out.println("-----");

    }
}
