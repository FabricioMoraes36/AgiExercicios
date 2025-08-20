package OrientacaoObjeto.Heranca.Varejo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutoPerecivel extends Produto{

   private String dataValidade;

    public ProdutoPerecivel(String codigo, String nome, double preco,String dataValidade) {
        super(codigo, nome, preco);
        this.dataValidade = dataValidade;
    }
    public boolean produtoVencidoOuNao(String data){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.parse(dataValidade,format);
        LocalDate atual = localDate.parse(data,format);

      return atual.isAfter(localDate);
    }
}
