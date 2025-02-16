//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//decimais.

import java.util.Scanner;

class Exercicio {
    public static void main(String[] arguments) {
        System.out.println("Calcular o salario de um funcionario");
        int numeroFuncionario, horasTrabalhadas;
        double valorHora, salario;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero do funcionario: ");
        numeroFuncionario = sc.nextInt();
        System.out.print("Digite a quantidade de horas trabalhadas: ");
        horasTrabalhadas = sc.nextInt();
        System.out.print("Digite o valor da hora trabalhada: ");
        valorHora = sc.nextDouble();

        salario = (double) horasTrabalhadas * valorHora;

        System.out.println("NUMBER: " + numeroFuncionario);
        System.out.printf("SALARY: U$$ %.2f%n", salario);

        sc.close();
    }
}

// Prestar atencao no . ou  - > se a config nao estiver nos EUA e colocar , ao inves de . da erro
