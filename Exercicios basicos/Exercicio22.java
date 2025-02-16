// Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
// cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
// menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
import java.util.Scanner;

class Exercicio {
    public static void main(String[] arguments) {

        Scanner sc = new Scanner(System.in);

        int X, Y;
        X = 0;
        Y = 0;

        System.out.print("Digite a coordenada X: ");
        X = sc.nextInt();
        System.out.print("Digite a coordenada Y: ");
        Y = sc.nextInt();

        while(X != 0 && Y != 0) {
            if(X > 0 && Y > 0) {
                System.out.println("PRIMEIRO QUADRANTE");
            }
            else if(X > 0 && Y < 0) {
                System.out.println("QUARTO QUADRANTE");
            }
            else if(X < 0 && Y > 0) {
                System.out.println("SEGUNDO QUADRANTE QUADRANTE");
            }
            else {
                System.out.println("TERCEIRO QUADRANTE");
            }

            System.out.print("Digite a coordenada X: ");
            X = sc.nextInt();
            System.out.print("Digite a coordenada Y: ");
            Y = sc.nextInt();
        }
        
        sc.close();
    }
}
