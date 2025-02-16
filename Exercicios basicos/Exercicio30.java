// Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
// começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
// exemplo
import java.util.Scanner;

class Exercicio {
    public static void main(String[] arguments) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro positivo: ");
        int N = sc.nextInt();

        for(int i = 1; i <= N; i++) {
            int quadrado = i * i;
            int cubo = quadrado * i;
            System.out.printf("%d %d %d%n", i, quadrado, cubo);
        }
        sc.close();
    }
}
