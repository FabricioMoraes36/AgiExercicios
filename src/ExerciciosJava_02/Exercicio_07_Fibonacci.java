package ExerciciosJava_02;

import java.util.Scanner;

public class Exercicio_07_Fibonacci {
    public static void main(String[] args) {
        int a = 0,b = 1,c = 0;
        int n;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Primeiro termo da fibonacci:" + a);
        System.out.println("Segundo termo da fibonacci:" + b);

        while(c < n) {
         c = a + b;
           a = b;
           b = c;
            System.out.println("Proximo da seq.fibonacci: " + c);

        }
    }
}
