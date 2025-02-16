// Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
// incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
// impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
import java.util.Scanner;

class Exercicio {
    public static void main(String[] arguments) {

        Scanner sc = new Scanner(System.in);

        int senhaCorreta = 2002;
        int senhaDigitada;

        System.out.print("Digite a senha: ");
        senhaDigitada = sc.nextInt();

        while(senhaDigitada != senhaCorreta) {
            System.out.println("SENHA INCORRETA");

            System.out.print("Digite a senha: ");
            senhaDigitada = sc.nextInt();
        }

        if(senhaDigitada == senhaCorreta) {
            System.out.print("ACESSO PERMITIDO");
        }

        sc.close();
    }
}
