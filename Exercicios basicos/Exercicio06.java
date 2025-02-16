//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago
import java.util.Scanner;

class Exercicio {
    public static void main(String[] arguments) {
        System.out.println("Calcular o valor a ser pago");

        Scanner sc = new Scanner(System.in);

        int codigoPeca1, qtdPeca1, codigoPeca2, qtdPeca2;
        double valorPeca1, valorPeca2, resultado, total1, total2;

        System.out.print("Digite o codigo da peca 1: ");
        codigoPeca1 = sc.nextInt();
        System.out.print("Digite o numero de pecas: ");
        qtdPeca1 = sc.nextInt();
        System.out.print("Digite o valor unitario de cada peca: ");
        valorPeca1 = sc.nextDouble();
        System.out.print("Digite o codigo da peca 2: ");
        codigoPeca2 = sc.nextInt();
        System.out.print("Digite o numero de pecas: ");
        qtdPeca2 = sc.nextInt();
        System.out.print("Digite o valor unitario de cada peca: ");
        valorPeca2 = sc.nextDouble();

        total1 = qtdPeca1 * valorPeca1;
        total2 = qtdPeca2 * valorPeca2;

        resultado = total1 + total2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", resultado);

        sc.close();
    }
}
