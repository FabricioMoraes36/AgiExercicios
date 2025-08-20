package OrientacaoObjeto.Heranca.InvestimentoRendaFixa;

public class InvestimentoRendaFixa extends Investimento{
    private double taxaAnual;
    private int periodoMeses;

    public InvestimentoRendaFixa(String codigo, double valorInicial, double taxaAnual, int periodoMeses) {
        super(codigo, valorInicial);
        this.taxaAnual = taxaAnual;
        this.periodoMeses = periodoMeses;
    }

    public double getTaxaAnual() {
        return taxaAnual;
    }

    public void setTaxaAnual(double taxaAnual) {
        this.taxaAnual = taxaAnual;
    }

    public int getPeriodoMeses() {
        return periodoMeses;
    }

    public void setPeriodoMeses(int periodoMeses) {
        this.periodoMeses = periodoMeses;
    }

    public void calcularValorFinal(){
        double valorFinal = getValorInicial() * (1 + getTaxaAnual() * (periodoMeses / 12.0));

        System.out.printf("O valor final sera: %.2f " , valorFinal);
    }
}
