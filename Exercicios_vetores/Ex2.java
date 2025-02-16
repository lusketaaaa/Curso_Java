// Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
//- Imprimir todos os elementos do vetor
//- Mostrar na tela a soma e a média dos elementos do vetor
package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros_digitados, numero;
        double media;
        int soma = 0;
        System.out.print("Quantos numeros voce vai digitar? ");
        numeros_digitados = sc.nextInt();
        int[] lista = new int[numeros_digitados];

        for(int i = 0; i < numeros_digitados; i++) {
            System.out.print("Digite um numero: ");
            numero = sc.nextInt();
            lista[i] = numero;
            soma += numero;
        }

        for(int x = 0; x < lista.length; x++) {
            System.out.print(lista[x] + " ");
        }
        System.out.println("");
        media = soma / (lista.length);
        System.out.println("Soma: " + soma);
        System.out.println("Media: " + media);

        sc.close();
        }
    }
