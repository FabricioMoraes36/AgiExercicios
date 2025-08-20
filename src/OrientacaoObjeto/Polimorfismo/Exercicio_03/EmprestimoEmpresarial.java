package OrientacaoObjeto.Polimorfismo.Exercicio_03;

public class EmprestimoEmpresarial extends Emprestimo{

    public EmprestimoEmpresarial() {
    }

    public EmprestimoEmpresarial(double valorEmprestado) {
        super(valorEmprestado);
    }

    @Override
    public void calcularParcela(int meses) {
        double resultado = ((getValorEmprestado() * meses) * 0.01) + 100;
        System.out.printf("No emprestimo empresarial,com taxa de 2 e 100R$ por parcela o valor será: %.2f " ,  resultado);
        System.out.println("-----");
    }
}
