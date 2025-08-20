package OrientacaoObjeto.Heranca.InvestimentoRendaFixa;

public class MainInvest {
    public static void main(String[] args) {
        InvestimentoRendaFixa investimentoRendaFixa = new InvestimentoRendaFixa("10",100,0.01,10);
        investimentoRendaFixa.calcularValorFinal();
    }
}
