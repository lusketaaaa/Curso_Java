// Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
// segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
import java.util.Scanner;

class Exercicio {
    public static void main(String[] arguments) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int N = sc.nextInt();

        for(int i = 0; i < N; i++) {
            System.out.print("Digite o primeiro numero: ");
            double primeiroNumero = sc.nextDouble();
            System.out.print("Digite o segundo numero: ");
            double segundoNumero = sc.nextDouble();

            if(segundoNumero == 0) {
                System.out.println("Divisao Impossivel");
            } else {
                double resultadoDivisao = (primeiroNumero / segundoNumero);
                System.out.println(resultadoDivisao);
            }
        }
        sc.close();
    }
}
