// Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
//tela todos os números pares, e também a quantidade de números pares.
package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, numeroDigitado;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();
        int[] lista = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Digite o numero: ");
            numeroDigitado = sc.nextInt();
            lista[i] = numeroDigitado;
        }

        System.out.println("Numeros pares:");

        for(int x = 0; x < lista.length; x++) {
            if(lista[x] % 2 == 0) {
                System.out.printf(lista[x] +  " ");
            }
        }

        sc.close();
        }
    }
