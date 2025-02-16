// Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//mensagem explicativa, conforme exemplos.

import java.util.Scanner;

class Exercicio {
    public static void main(String[] arguments) {
        Scanner sc = new Scanner(System.in);

        int A, B;
        System.out.print("Digite um numero: ");
        A = sc.nextInt();
        System.out.print("Digite outro numero: ");
        B = sc.nextInt();

        int C = A + B;

        System.out.printf("Soma = " + C);

        sc.close();
    }
}
