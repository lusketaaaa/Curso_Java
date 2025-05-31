package org.example;
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[][] matriz;
        System.out.print("Digite o tamanho da matriz: ");
        int size = sc.nextInt();
        matriz = new int[size][size];
        // Preenchendo a matriz
        for(int x = 0; x < size; x++) {
            for(int y = 0; y < size; y++) {
                System.out.printf("Digite o numero da posicao %d %d da matriz: ", x, y);
                matriz[x][y] = sc.nextInt();
            }
        }
        // Exibindo a matriz
        System.out.println("Exibindo a matriz: ");
        for(int x = 0; x < size; x++) {
            for(int y = 0; y < size; y++) {
                System.out.printf(" %d ", matriz[x][y]);
            }
            System.out.println();
        }
        // Exibindo a diagonal principal:
        System.out.println("Exibindo a diagonal principal: ");
        for(int x = 0; x < size; x ++) {
            System.out.printf(" %d ", matriz[x][x]);
        }
        System.out.println();
        // Exibindo os numeros negativos:
        System.out.println("Exibindo os numeros negativos: ");
        int contadorNegativos = 0;
        for(int x = 0; x < size; x++) {
            for(int y = 0; y < size; y++) {
                if(matriz[x][y] < 0) {
                    System.out.printf("%d ", matriz[x][y]);
                    contadorNegativos += 1;
                }
            }
        }
        System.out.println();
        System.out.println("Quantidade de numeros negativos: " + contadorNegativos);
        sc.close();
    }
}
