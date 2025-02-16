// Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
//tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
//bem como os nomes dessas pessoas caso houver.
package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome;
        int quantidade_pessoas, idade, somaMenorIdade;
        double altura, somaAlturas, mediaAlturas, porcentagemMenorDeIdade;
        somaAlturas = 0;
        somaMenorIdade = 0;

        System.out.print("Quantas pessoas serao digitadas?  ");
        quantidade_pessoas = sc.nextInt();

        String[] lista_nomes = new String[quantidade_pessoas];
        double[] lista_alturas = new double[quantidade_pessoas];
        int[] lista_idade = new int[quantidade_pessoas];

        for(int i = 0; i < quantidade_pessoas; i++) {
            System.out.print("Nome: ");
            nome = sc.next();
            lista_nomes[i] = nome;
            System.out.print("Idade: ");
            idade = sc.nextInt();
            lista_idade[i] = idade;
            System.out.print("Altura: ");
            altura = sc.nextDouble();
            lista_alturas[i] = altura;
            somaAlturas += altura;
        }

        for(int x = 0; x < lista_idade.length; x++) {
            if(lista_idade[x] < 16) {
                somaMenorIdade += 1;
            }
        }

        porcentagemMenorDeIdade = ((double)somaMenorIdade / quantidade_pessoas) * 100;
        mediaAlturas = somaAlturas / quantidade_pessoas;

        System.out.printf("Altura media: %.2f%n", mediaAlturas);
        System.out.printf("Menores de idade: %.2f%n", porcentagemMenorDeIdade, "%");

        for(int x = 0; x < lista_idade.length; x++) {
            if(lista_idade[x] < 16) {
                System.out.println(lista_nomes[x]);
            }
        }

        System.out.print(somaMenorIdade);
        sc.close();
        }
    }
