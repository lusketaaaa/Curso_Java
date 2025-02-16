// Leia uma quantidade indeterminada de valores inteiros X e Y. Escreva para cada X e Y uma mensagem que indique se
// estes valores foram digitados em ordem crescente ou decrescente.
import java.util.Scanner;

class Exercicio {
    public static void main(String[] arguments) {

        Scanner sc = new Scanner(System.in);

        int X, Y;

        System.out.print("Digite o valor de X: ");
        X = sc.nextInt();
        System.out.print("Digite o valor de Y: ");
        Y = sc.nextInt();

        while(X != Y) {
            if(X < Y) {
                System.out.println("DECRESCENTE");
            }
            else {
                System.out.println("Crescente");
            }

            System.out.print("Digite o valor de X: ");
            X = sc.nextInt();
            System.out.print("Digite o valor de Y: ");
            Y = sc.nextInt();
        }

        sc.close();
    }
}

