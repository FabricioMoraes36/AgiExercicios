package OrientacaoObjeto.Polimorfismo.Exercicio_02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Investimento> investimentos = new ArrayList<>();

        investimentos.add(new Investimento(100));
        investimentos.add(new Poupanca(100));
        investimentos.add(new Cdb(100));
        for (Investimento i : investimentos){
            i.calcularRendimento();
        }
        }

}
