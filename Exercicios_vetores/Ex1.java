// Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
//e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerosDigitados, n;
        System.out.print("Quantos numeros voce vai digitar? ");
        numerosDigitados = sc.nextInt();

        int lista[] = new int[numerosDigitados];

        for(int i = 0; i < numerosDigitados; i++) {
                System.out.print("Digite um numero: ");
                n = sc.nextInt();
                lista[i] = n;
        }
        System.out.println("Numeros negativos:");
        for(int x = 0; x < lista.length; x++) {
            if(lista[x] < 0) {
                System.out.println(lista[x]);
            }
        }

        sc.close();
        }
    }
