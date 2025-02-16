// Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
// um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
// 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
// que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
// mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
// exemplo.
import java.util.Scanner;

class Exercicio {
    public static void main(String[] arguments) {

        Scanner sc = new Scanner(System.in);

        int alcool, gasolina, diesel, fim, opcoesPossiveis, numeroCliente;
        alcool = 0;
        gasolina = 0;
        diesel = 0;
        fim = 0;
        numeroCliente = 0;

        System.out.print("Digite um numero [1]ALCOOL / [2] GASOLINA / [3] DIESEL / [4] FIM : ");
        numeroCliente = sc.nextInt();

        if (numeroCliente != 1 && numeroCliente != 2 && numeroCliente != 3) {
            System.out.print("Digite um numero valido: ");
            numeroCliente =  sc.nextInt();
        }

        while(numeroCliente != 4) {
            if(numeroCliente == 1) {
                alcool += 1;
            }
            else if(numeroCliente == 2) {
                gasolina += 1;
            }
            else if(numeroCliente == 3) {
                diesel += 1;
            }
            System.out.print("Digite um numero [1]ALCOOL / [2] GASOLINA / [3] DIESEL / [4] FIM : ");
            numeroCliente = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("ALCOOL: " +  alcool);
        System.out.println("GASOLINA: " + gasolina);
        System.out.println("DIESEL: " + diesel);

        sc.close();
    }
}
