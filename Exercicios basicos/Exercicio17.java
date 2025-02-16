import java.util.Scanner;

class Exercicio {
    public static void main(String[] arguments) {

        Scanner sc = new Scanner(System.in);

        double valorA, valorB, valorC, r1, r2, raiz;

        System.out.print("Digite o valor  A: ");
        valorA = sc.nextDouble();
        System.out.print("Digite o valor  B: ");
        valorB = sc.nextDouble();
        System.out.print("Digite o valor  C: ");
        valorC = sc.nextDouble();

        raiz = (valorB * valorB) - 4 * valorA * valorC;

        if (raiz < 0) {
            System.out.println("As raízes não são reais.");
        } else {
            r1 = (-valorB + (Math.sqrt(raiz))) / (2 * valorA);
            r2 = (-valorB - (Math.sqrt(raiz))) / (2 * valorA);

            System.out.println("Raiz 1: " + r1);
            System.out.println("Raiz 2: " + r2);
        }

        sc.close();
    }
}
