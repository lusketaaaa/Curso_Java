// Fazer um programa que le tres numeros inteiros , em seguida mostar qual o menor dentre os tres numeros lidos
// em caso de empate, mostrar apenas uma vez
import java.util.Scanner;

class Exercicio {
    public static void main(String[] arguments) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o primeiro numero: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o segundo numero: ");
        int n2 = sc.nextInt();
        System.out.print("Digite o terceiro numero: ");
        int n3 = sc.nextInt();

        if (n1 < n2 && n1 < n3) {
            System.out.println("MENOR = " + n1);
        } else if (n2 < n1 && n2 < n3) {
            System.out.println("MENOR = " + n2);
        } else {
            System.out.println("MENOR = " + n3);
        }


        sc.close();
    }
}
