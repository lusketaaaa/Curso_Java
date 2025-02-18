// Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
//no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
//os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
//igual a 6.0 (seis).
package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] nomes = new String[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];

        for(int x = 0; x < n; x++) {
            System.out.println("Digite nome, primeira e segunda nota do aluno:");
            nomes[x] = sc.nextLine();
            nota1[x] = sc.nextDouble();
            nota2[x] = sc.nextDouble();
            sc.nextLine();
        }

        boolean algumAprovado = false;
        System.out.println("Alunos aprovados: ");

        for(int y = 0; y < nota1.length; y++) {
            double media = (nota1[y] + nota2[y]) / 2;

            if(media >= 6) {
                System.out.println(nomes[y]);
                algumAprovado = true;
            }
        }

        if (!algumAprovado) {
            System.out.println("Nenhum aluno foi aprovado");
        }

        sc.close();
    }
}
