package OrientacaoObjeto.Polimorfismo.Exercicio_03;

import java.util.ArrayList;
import java.util.List;

public class EmprestimoMain {
    public static void main(String[] args) {

        List<Emprestimo>emprestimos = new ArrayList<>();
        emprestimos.add(new Emprestimo(100));
        emprestimos.add(new EmprestimoPessoal(100));
        emprestimos.add(new EmprestimoEmpresarial(100));

        for (Emprestimo i : emprestimos){
            i.calcularParcela(12);
        }

    }

}
