// Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
// começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
import java.util.Scanner;

class Exercicio {
    public static void main(String[] arguments) {
        System.out.println("Duracao do jogo");

        Scanner sc = new Scanner(System.in);

        int horaInicial, horaFinal, horasDuracao;

        System.out.print("Inicio do jogo: ");
        horaInicial = sc.nextInt();
        System.out.print("Final do jogo: ");
        horaFinal = sc.nextInt();

        if(horaInicial - horaFinal ==  0) {
            horasDuracao = 24;
        }
        else if(horaInicial > horaFinal) {
            horasDuracao = (horaFinal + 24) - horaInicial;
        }
        else {
            horasDuracao = horaFinal - horaInicial;
        }

        System.out.println("O jogo durou: " + horasDuracao + " horas");

        sc.close();
    }
}
