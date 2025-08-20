package OrientacaoObjeto.Polimorfismo.Exercicio_01;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;
import java.util.List;

public class MainPagamentos {
    public static void main(String[] args) {
        List<Pagamento> array = new ArrayList<>();

       array.add(new Pagamento(1000));
        array.add(new PagamentoCartaoCredito(1000,"432424424"));
        array.add(new PagamentoPix(2100,"cliente@gmail.com"));


       for (Pagamento i : array){
           i.processarPagamento();
       }

    }
}
