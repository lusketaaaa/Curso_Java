// Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
// de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
// ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
// Se o ponto estiver na origem, escreva a mensagem “Origem”.
// Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
// situação.
import java.util.Scanner;

class Exercicio {
    public static void main(String[] arguments) {

        Scanner sc = new Scanner(System.in);


        String quadrante = "quadrante x";
        double valorX, valorY;
        System.out.print("Digite o valor de X: ");
        valorX = sc.nextDouble();
        System.out.print("Digite o valor de Y: ");
        valorY = sc.nextDouble();

        if (valorX == 0 && valorY == 0) {
            quadrante = "ORIGEM";
        }
        else if (valorX > 0 && valorY > 0) {
            quadrante = "QUADRANTE 1";
        }
        else if (valorX > 0 && valorY < 0) {
            quadrante = "QUADRANTE 4";
        }
        else if (valorX < 0 && valorY > 0) {
            quadrante = "QUADRANTE 2";
        }
        else {
            quadrante = "QUADRANTE 3";
        }

        System.out.print(quadrante);

        sc.close();
    }
}
