// Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
// seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
// nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
import java.util.Scanner;

class Exercicio {
    public static void main(String[] arguments) {

        Scanner sc = new Scanner(System.in);

        double valorUsuario;

        System.out.print("Digite um numero entre 0 e 100: ");
        valorUsuario = sc.nextDouble();

        if(valorUsuario <= 25 && valorUsuario > 0) {
            System.out.print("Intervalo: [0,25]");
        }
        else if(valorUsuario <= 50  && valorUsuario > 25) {
            System.out.print("Intervalo: [25,50]");
        }
        else if (valorUsuario <= 75 && valorUsuario > 50) {
            System.out.print("Intervalo: [50,75]");
        }
        else if (valorUsuario <= 100 && valorUsuario > 75) {
            System.out.print("Intervalo: [75,100]");
        }
        else {
            System.out.println("Valor fora dos intevalos");
        }

        sc.close();
    }
}
