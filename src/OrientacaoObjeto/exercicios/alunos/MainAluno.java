package OrientacaoObjeto.exercicios.alunos;

import java.util.Scanner;

public class MainAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        double nota1,nota2;

        System.out.println("Digite o nome do aluno: ");
        nome = sc.nextLine();
        System.out.println("Digite a primeira nota:");
        nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota:");
        nota2 = sc.nextDouble();

        Aluno aluno1 = new Aluno(nome,nota1,nota2);

        aluno1.calcularMedia(nota1,nota2);
        aluno1.verificarSituacao();
        aluno1.exibirRelatorio();
    }
}
