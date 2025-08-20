package OrientacaoObjeto.Oveloading.Exercicio_02;

public class CarrinhoDeComprasMain {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.Calculo(10,20,30,40,50);//calculo com n valores
        carrinhoDeCompras.Calculo(10,20);//calculo simples
        carrinhoDeCompras.Calculo(10,20,0.005);


    }
}
