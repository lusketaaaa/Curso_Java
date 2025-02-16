// Faça um programa para ler um número indeterminado de dados, contendo cada um, a idade de um indivíduo.
// O último dado, que não entrará nos cálculos, contém um valor de idade negativa. Calcular e imprimir a
// idade média deste grupo de indivíduos. Se for entrado um valor negativo na primeira vez, mostrar a mensagem
// "impossível calcular".
import java.util.Scanner;

class Exercicio {
    public static void main(String[] arguments) {

        Scanner sc = new Scanner(System.in);

        int idade, contador, totalIdade;
        double media;

        media = 0;
        totalIdade = 0;
        contador = 0;

        System.out.print("Digite a idade: ");
        idade = sc.nextInt();

        while(idade > 0) {
            contador = contador + 1; // ou contador += 1
            totalIdade = totalIdade + idade;

            System.out.print("Digite a idade: ");
            idade = sc.nextInt();
        }

        if(contador == 0) {
            System.out.print("IMPOSSIVEL CALCULAR");
        }
        else {
            media = (double) totalIdade / contador;
            System.out.printf("%.2f%n", media);
        }

        sc.close();
    }
}
