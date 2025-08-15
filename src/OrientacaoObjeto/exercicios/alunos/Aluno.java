package OrientacaoObjeto.exercicios.alunos;

public class Aluno {
    String nome;
    double nota1;
    double nota2;

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double calcularMedia(double nota1,double nota2){
        double resultado = (nota1 + nota2) / 2;
        return resultado;
    }
    public String verificarSituacao(){
        double resultado = calcularMedia(nota1,nota2);
        if (resultado > 6){
            return "Aprovado";
        } else if (resultado == 6) {
            return "Recuperação";

        }else{
            return "Reprovado";
        }



    }
    public void exibirRelatorio(){
        System.out.println();
        System.out.println("O aluno " + nome);
        System.out.println("tirou as notas " + nota1 + " é " + nota2);
        System.out.println("E a situação dele ficou como: " + verificarSituacao());
    }

}
