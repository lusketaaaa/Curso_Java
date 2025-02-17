// Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
//mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
//os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        double numero;
        double soma = 0;
        double media;
        System.out.print("Quantos elementos tera o vetor? ");
        n = sc.nextInt();

        double[] vetor = new double[n];

        for(int x = 0; x < n; x++) {
            System.out.print("Digite um numero: ");
            numero = sc.nextDouble();
            vetor[x] = numero;
            soma += numero;
        }

        media = soma / n;
        System.out.println("Media do vetor = " + media);
        System.out.println("Elementos abaixo da media: ");
        for(int y = 0; y < n; y++) {
            if(vetor[y] < media) {
                System.out.println(vetor[y]);
            }
        }

        sc.close();
        }
    }
