// Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
// Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
// essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo)
import java.util.Scanner;

class Exercicio {
    public static void main(String[] arguments) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int N = sc.nextInt();

        int in = 0;
        int out = 0;

        for(int i = 0; i < N; i++) {
            System.out.print("Digite um numero: ");
            int numero = sc.nextInt();
            if (numero > 9 && numero < 21) {
                in += 1;
            } else {
                out += 1;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

        sc.close();
    }
}
