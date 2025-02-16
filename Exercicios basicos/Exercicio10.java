// Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
// Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
// ordem crescente ou decrescente.
import java.util.Scanner;

class Exercicio {
    public static void main(String[] arguments) {
        System.out.println("Multiplos ou nao?");

        Scanner sc = new Scanner(System.in);

        int A, B, maiorNumero, menorNumero;

        System.out.print("Digite o valor A: ");
        A = sc.nextInt();
        System.out.print("Digite o valor B: ");
        B = sc.nextInt();

        if(A > B) {
            maiorNumero = A;
            menorNumero = B;
        }
        else {
            maiorNumero = B;
            menorNumero = A;
        }

        if(maiorNumero % menorNumero == 0 ) {
            System.out.print("Os numeros sao multiplos");
        }
        else {
            System.out.print("Os numeros nao sao multiplos");
        }
        
        sc.close();
    }
}
