// Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
// de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
// conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
// peso 5.
import java.util.Scanner;

class Exercicio {
    public static void main(String[] arguments) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int N = sc.nextInt();

        double somaNumeros = 0;

        for(int i = 0; i < N; i++) {
            System.out.print("Digite um numero: ");
            double numero1 = sc.nextDouble();
            numero1 = numero1 * 2;

            System.out.print("Digite um numero: ");
            double numero2 = sc.nextDouble();
            numero2 = numero2 * 3;

            System.out.print("Digite um numero: ");
            double numero3 = sc.nextDouble();
            numero3 = numero3 * 5;

            somaNumeros = (numero1 + numero2 + numero3) / (3 + 2 + 5);

            System.out.printf("%.1f%n", somaNumeros);
        }

        sc.close();
    }
}
