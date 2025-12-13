package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int accountNumber;
        double initialDeposit;
        String accountHolder;

        System.out.println("Create an account.");
        System.out.print("Enter account number: ");
        accountNumber = sc.nextInt();
        System.out.print("Enter account Holder: ");
        sc.nextLine();
        accountHolder = sc.nextLine();
        initialDeposit = readInitialDeposit(sc);
        Account account = new Account(accountNumber, accountHolder, initialDeposit);

        System.out.println("Account Data:");
        System.out.println(account);

        System.out.print("Enter a deposit value: ");
        account.deposit(sc.nextDouble());
        System.out.println("Updated account Data:");
        System.out.println(account);

        System.out.print("Enter a withdraw value: ");
        account.withdraw(sc.nextDouble());
        System.out.println("Updated account Data:");
        System.out.println(account);

        sc.close();
    }

    public static double readInitialDeposit(Scanner sc) {
        char option;

        while (true) {
            System.out.print("Is there an initial deposit (y/n)? ");
            option = Character.toLowerCase(sc.next().charAt(0));

            if (option == 'y') {
                System.out.print("Enter initial deposit: ");
                return sc.nextDouble();
            } else if (option == 'n') {
                return 0.0;
            } else {
                System.out.println("Invalid option. Please enter y or n.");
            }
        }
    }
}
