// Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
//aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
//digitado, mostrar a mensagem "NENHUM NUMERO PAR"
package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        int userNumber;
        int contadorPares = 0;
        int somaPares = 0;
        double mediaPares = 0;
        System.out.print("Quantos elementos tera o vetor? ");
        n = sc.nextInt();

        int[] vetorA = new int[n];

        for(int x = 0; x < n; x++) {
            System.out.print("Digite um numero: ");
            userNumber = sc.nextInt();
            vetorA[x] = userNumber;
        }

        for(int y = 0; y < n; y++) {
            if(vetorA[y] % 2 == 0) {
                contadorPares += 1;
                somaPares = somaPares + vetorA[y];
            }
        }

        if(contadorPares == 0) {
            System.out.println("Nenhum numero par");
        } else {
            mediaPares = somaPares / contadorPares;
            System.out.printf("Media pares: " + mediaPares);
        }

        sc.close();
        }
    }
