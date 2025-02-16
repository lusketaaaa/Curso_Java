// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não
import java.util.Scanner;

class Exercicio {
    public static void main(String[] arguments) {
        System.out.println("Negativo ou positivo...");

        Scanner sc = new Scanner(System.in);

        int numeroUsuario;

        System.out.print("Digiteu um numero: ");
        numeroUsuario = sc.nextInt();

        if(numeroUsuario >= 0) {
            System.out.print("O numero e positvo");
        }
        else {
            System.out.print("O numero e negativo");
        }

        sc.close();
    }
}
