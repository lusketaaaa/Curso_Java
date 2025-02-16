// Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

import java.util.Scanner;

class Exercicio {
    public static void main(String[] arguments) {
        System.out.println("Calcular a diferenca...");
        int A, B, C, D, R;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        A = sc.nextInt();
        System.out.print("Digite o valor de B: ");
        B = sc.nextInt();
        System.out.print("Digite o valor de C: ");
        C = sc.nextInt();
        System.out.print("Digite o valor de D: ");
        D = sc.nextInt();

        R = (A * B) - (C * D);

        System.out.printf("Diferenca = " + R);

        sc.close();
    }
}
