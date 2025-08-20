package OrientacaoObjeto.Oveloading.Exercicio_02;

public class CarrinhoDeCompras {

    // (double...preco)

    public void Calculo(double valor1,double valor2){
        double calcular = valor1 + valor2;
        System.out.println("Somando suas compras o valor é: " + calcular);
    }

    public void Calculo(double valor1,double valor2,double taxa){
        System.out.println("Somando os dois valores com desconto: " + taxa + " O tax é:");
        double soma = valor1 + valor2;
        double tax = soma * (taxa /100);
        double fim = soma - tax;
        System.out.printf("%.1f",fim);

    }

    public void Calculo(double...precos){
        double soma = 0;
        for (double p : precos){
            soma += p;
        }
        System.out.println("A soma de todos os itens do seu carrinho é: " + soma);
    }
}
