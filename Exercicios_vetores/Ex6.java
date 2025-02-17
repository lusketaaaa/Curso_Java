// Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
//terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
//o vetor C gerado.
package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, valorVA, valorVB, valorVC;

        System.out.print("Quantos valores em cada vetor? ");
        n = sc.nextInt();

        int[] vetorA = new int[n];
        int[] vetorB = new int[n];
        int[] vetorC = new int[n];

        System.out.println("Digite os valores do vetor A: ");
        for(int x = 0; x < n; x++) {
            valorVA = sc.nextInt();
            vetorA[x] = valorVA;
        }

        System.out.println("Digite os valores do vetor B: ");
        for(int y = 0; y < n; y++) {
            valorVB = sc.nextInt();
            vetorB[y] = valorVB;
        }

        for(int z = 0; z < n; z++) {
            valorVC = vetorB[z] + vetorA[z];
            vetorC[z] = valorVC;
        }

        System.out.println("Vetor resultante: ");

        for(int w = 0; w < vetorC.length; w++) {
            System.out.println(vetorC[w]);
        }

        sc.close();
        }
    }
