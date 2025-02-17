// Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
//o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
//considerando a primeira posição como 0 (zero)
package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        double numero;
        double maiorNumero = 0;
        int posicao = 0;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();
        double[] lista = new double[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            numero = sc.nextDouble();
            lista[i] = numero;
        }

        for(int x = 0; x < lista.length; x++) {
            if(lista[x] > maiorNumero) {
                maiorNumero = lista[x];
                posicao = x;
            }

        }
        System.out.println("Maior numero: " + maiorNumero);
        System.out.println("Posicao no vetor: " +  posicao);
        sc.close();
        }
    }
