// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
import java.util.Scanner;

class Exercicio {
    public static void main(String[] arguments) {
        System.out.println("Par ou impar?");

        Scanner sc = new Scanner(System.in);

        int numeroUsuario;

        System.out.print("Digiteu um numero: ");
        numeroUsuario = sc.nextInt();

        if(numeroUsuario % 2 == 0) {
            System.out.print("O numero e par");
        }
        else {
            System.out.print("O numero e impar");
        }

        sc.close();
    }
}

// um = -> atribuicao
// dois = -> comparacao
