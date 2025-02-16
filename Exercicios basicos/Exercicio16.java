// Faca um programa que le duas notas e caso a media das notas seja inferior a 60.00, exibir reprovado, caso
// contrario exibir aprovado
import java.util.Scanner;

class Exercicio {
    public static void main(String[] arguments) {

        Scanner sc = new Scanner(System.in);

        double nota1, nota2, media;
        System.out.print("Digite a nota do primeiro semestre: ");
        nota1 = sc.nextDouble();
        System.out.print("Digite a nota do segundo semestre: ");
        nota2 = sc.nextDouble();

        media = (nota1 + nota2) / 2;

        if (media < 60) {
            System.out.print("Aluno Reprovado Nota final: " + media );
        }
        else {
            System.out.print("Aluno Aprovado Nota final: " + media);
        }


        sc.close();
    }
}
