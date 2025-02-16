package application;
import entities.ContaBancaria;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double firstDeposit;

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String accountHolder = sc.nextLine();

        System.out.print("Is there an inital deposit? (y/n)? ");
        String inicialDeposit = sc.nextLine();

        if(inicialDeposit.equals("y")) {
            System.out.print("Enter initial deposit value: ");
            firstDeposit = sc.nextDouble();
        } else {
            firstDeposit = 0;
        }

        ContaBancaria contaBancaria = new ContaBancaria(accountNumber, accountHolder, firstDeposit);

        System.out.println();

        System.out.println("Account data: ");
        System.out.println(contaBancaria.getAccountInfo());

        System.out.println();

        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        contaBancaria.makeDeposit(depositValue);

        System.out.println("Account data: ");
        System.out.println(contaBancaria.getAccountInfo());

        System.out.println();

        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        contaBancaria.makeWithdraw(withdrawValue);
        System.out.println(contaBancaria.getAccountInfo());

        sc.close();
    }
}