// Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
// Lembrando que, por definição, fatorial de 0 é 1.
import java.util.Scanner;

class Exercicio {
    public static void main(String[] arguments) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um inteiro para obter seu fatorial: ");
        int N = sc.nextInt();
        int resultado = 1   ;

        for(int i = 1; i <= N; i++) {
            resultado = resultado * i;
        }

        System.out.print(resultado);

        sc.close();
    }
}
