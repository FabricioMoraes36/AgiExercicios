import java.util.Scanner;

public class PerfilCredito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu salario:");
        double salario = sc.nextDouble();
        System.out.println("Digite quanto você gasta mensalmente:");
        double mensal = sc.nextDouble();
        double porcentagem = salario * 0.04;
        if (mensal <= porcentagem){
            System.out.println("credito aprovado,pois seus gastos mensais correspondem até 40% do seu salario");
        }else{
            System.out.println("credito negado,pois seus gastos mensais ultrapassam até 40% do seu salario");

        }
    }
}
