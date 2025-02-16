// Ler um número inteiro N e calcular todos os seus divisores.
import java.util.Scanner;

class Exercicio {
    public static void main(String[] arguments) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero N: ");
        int N = sc.nextInt();
        for(int i = 0; i < N; i++) {
            int antecessor = (N - i);
            if(N % antecessor == 0) {
                System.out.println(antecessor);
            }
        }
        sc.close();
    }
}
