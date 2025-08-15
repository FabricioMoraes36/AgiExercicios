package OrientacaoObjeto.exercicios.Funcionario;

import java.util.Scanner;

public class FuncionarioMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        double salarioBruto,descontoINSS,descontoIR;
        System.out.println("Digite seu nome:");
        nome = sc.nextLine();
        System.out.println("Digite seu salario bruto:");
        salarioBruto = sc.nextDouble();
        System.out.println("Digite o desconto do inss: ");
        descontoINSS = sc.nextDouble();
        System.out.println("Digite o desconto do imposto de renda: ");
        descontoIR = sc.nextDouble();

        Funcionario f1 = new Funcionario(nome,salarioBruto,descontoINSS,descontoIR);
        f1.calcularSalarioLiquido();
        f1.exibirFolhaDePagamento();
    }
}
