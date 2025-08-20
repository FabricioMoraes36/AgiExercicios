package OrientacaoObjeto.Polimorfismo.Exercicio_04;

import java.util.ArrayList;
import java.util.List;

public class ContaBancariaMain {
    public static void main(String[] args) {
        List<ContaBancaria> contas = new ArrayList<>();
        contas.add(new ContaBancaria("Glauber",1000));
        contas.add(new ContaPoupanca("Aurelio",2000));
        contas.add(new ContaCorrente("Jailson Mendes",100));

        for (ContaBancaria conta : contas){
            conta.gerarRelatorio();
        }
    }
}
