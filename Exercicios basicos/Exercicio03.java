// Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
//casas decimais conforme exemplos.
//Fórmula da área: area = π . raio2
//Considere o valor de π = 3.14159

import java.util.Scanner;

class Exercicio {
    public static void main(String[] arguments) {
        System.out.println("Calcular a area do circulo...");
        double pi, raio, area;
        pi = 3.14159;

        Scanner sc = new Scanner(System.in );

        System.out.print("Digite o raio da circunferencia: ");
        raio = sc.nextDouble();

        area = Math.pow(raio, 2) * pi;
        System.out.printf("A area da circunferencia e: %.4f%n", area);

        sc.close();
    }
}
