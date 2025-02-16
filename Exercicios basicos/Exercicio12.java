// Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
// seguir, calcule e mostre o valor da conta a pagar.

// Na tabela:
// cachorro quente - codigo 1 - 4 reais
// x-salada - codigo 2 - 4,50 reais
// x-bacon - codigo 3 - 5 reais
// torrada simples - codigo 4 - 2 reais
// refrigerante - codigo 5 - 1,50 reais
import java.util.Scanner;

class Exercicio {
    public static void main(String[] arguments) {
        System.out.println("Duracao do jogo");

        Scanner sc = new Scanner(System.in);

        int codigoAlimento, quantidadeAlimento;
        double valorCompraFinal;
        double valorAlimento = 0;

        System.out.print("Digite o codigo do alimento: ");
        codigoAlimento = sc.nextInt();
        System.out.print("Digite a quantidade desejada: ");
        quantidadeAlimento = sc.nextInt();

        if (codigoAlimento == 1) {
            valorAlimento = 4.00;
        }
        else if (codigoAlimento == 2) {
            valorAlimento = 4.50;
        }
        else if (codigoAlimento == 3) {
            valorAlimento = 5.00;
        }
        else if (codigoAlimento == 4) {
            valorAlimento = 2.00;
        }
        else if (codigoAlimento == 5) {
            valorAlimento = 1.50;
        }
        else {
            System.out.print("Nao existe nenhum alimento registrado com este codigo.");
        }

        valorCompraFinal = valorAlimento * quantidadeAlimento;

        System.out.print("Total: R$" +  valorCompraFinal);
        
        sc.close();
    }
}
