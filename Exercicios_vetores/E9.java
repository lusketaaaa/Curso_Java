// Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
//devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
//da pessoa mais velha.
package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] vetorNomes = new String[n];
        int[] vetorIdade = new int[n];

        for (int x = 0; x < n; x++) {
            System.out.print("Nome: ");
            vetorNomes[x] = sc.nextLine();

            System.out.print("Idade: ");
            vetorIdade[x] = sc.nextInt();
            sc.nextLine();
        }

        int indexMaisVelho = 0;
        int maiorIdade = vetorIdade[0];

        for (int i = 1; i < vetorIdade.length; i++) {
            if (vetorIdade[i] > maiorIdade) {
                maiorIdade = vetorIdade[i];
                indexMaisVelho = i;
            }
        }

        System.out.printf("Pessoa mais velha: %s%n", vetorNomes[indexMaisVelho]);

        sc.close();
    }
}

