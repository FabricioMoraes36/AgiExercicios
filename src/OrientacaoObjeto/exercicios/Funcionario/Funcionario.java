package OrientacaoObjeto.exercicios.Funcionario;

public class Funcionario {
    String nome;
    double salarioBruto,descontoINSS,descontoIR;

    public Funcionario(String nome, double salarioBruto, double descontoINSS, double descontoIR) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.descontoINSS = descontoINSS;
        this.descontoIR = descontoIR;
    }

    public double calcularSalarioLiquido(){
        descontoIR = (salarioBruto * descontoIR)/100;
        descontoINSS = (salarioBruto * descontoINSS)/100;
        double salarioLiquido = salarioBruto - descontoINSS - descontoIR;
        return salarioLiquido;
    }
    public void exibirFolhaDePagamento(){
        System.out.println("O salario bruto de: "+ nome + " é " + salarioBruto);
        System.out.printf("O desconto do Inss com base do salario bruto: " , descontoINSS);
        System.out.println("O desconto do IR com base do salario bruto: " + descontoIR);
        System.out.println("Apos os descontos o salario liquido será: " + calcularSalarioLiquido());
    }
}
