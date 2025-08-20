package OrientacaoObjeto.Oveloading.Exercicio_01;

/*Que receba o capital, a taxa de juros mensal e o tempo em meses.

Que receba apenas o capital e a taxa, assumindo que o tempo padrão seja de 12 meses.

Que receba apenas o capital, assumindo taxa padrão de 1.5% ao mês e tempo de 12 meses.

*/


public class CalculadoraDeJuros {
    private double capital;
    private double taxaJuros;
    private int tempoEmMeses;

    public CalculadoraDeJuros() {
    }

    public CalculadoraDeJuros(double capital, double taxaJuros, int tempoEmMeses) {
        this.capital = capital;
        this.taxaJuros = taxaJuros;
        this.tempoEmMeses = tempoEmMeses;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public int getTempoEmMeses() {
        return tempoEmMeses;
    }

    //Recebe capital,taxa e tempoEmMeses
    public void Calculo(double capital, double taxa, int tempoEmMeses) {
        double calculo = capital * taxa * tempoEmMeses;
        System.out.println("Com os valores passados o calculo será: " + calculo);

    }
    //Recebe capital e taxa
    public void Calculo(double capital,double taxa){
        double calculo = capital * taxa * 12;
        System.out.println("Recebendo o capital e a taxa,em um tempo fixo de 12 meses: " + calculo);


    }
    //Recebe so o capital
    public void Calculo(double capital){
        double calculo = capital * 0.015 * 12;
        System.out.println("Recebendo apenas o capital, com taxa fixa de 1,5 e em 12 meses: " + calculo);

    }

}
