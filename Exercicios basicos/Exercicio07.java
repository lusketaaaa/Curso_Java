//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
//mostre:
//a) a área do triângulo retângulo que tem A por base e C por altura.
//b) a área do círculo de raio C. (pi = 3.14159)
//c) a área do trapézio que tem A e B por bases e C por altura.
//d) a área do quadrado que tem lado B.
//e) a área do retângulo que tem lados A e B.
import java.util.Scanner;

class Exercicio {
    public static void main(String[] arguments) {
        System.out.println("Calcular a area...");

        Scanner sc = new Scanner(System.in);

        double A, B, C, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;

        System.out.print("Digite o valor A: ");
        A = sc.nextDouble();
        System.out.print("Digite o valor B: ");
        B = sc.nextDouble();
        System.out.print("Digite o valor C: ");
        C = sc.nextDouble();

        areaTriangulo = (A * C) / 2;
        areaCirculo = 3.14159 * Math.pow(C, 2);
        areaTrapezio = ((A + B) * C ) / 2;
        areaQuadrado = Math.pow(B, 2);
        areaRetangulo = A * B;

        System.out.printf("Area do Triangulo: %.3f%n", areaTriangulo);
        System.out.printf("Area do Circulo: %.3f%n", areaCirculo);
        System.out.printf("Area do Trapezio: %.3f%n", areaTrapezio);
        System.out.printf("Area do Quadrado: %.3f%n", areaQuadrado);
        System.out.printf("Area do Retangulo: %.3f%n", areaRetangulo);

        sc.close();
    }
}
