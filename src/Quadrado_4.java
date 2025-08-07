import java.util.Scanner;

public class Quadrado_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0,impares = 1,num;
        System.out.println("Digite um numero:");
        num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            soma += impares;
            impares += 2;
            }

        System.out.println("o valor de " + num + " ao quadrado é " + soma);
        }


    }

