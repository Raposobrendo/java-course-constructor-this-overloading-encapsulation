package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Bank {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int number;
        String holder;
        double balance;

        System.out.print("Enter number number: ");
        number = sc.nextInt();
        System.out.print("Enter number holder name: ");
        sc.nextLine();
        holder = sc.nextLine();
        balance = readInitialDeposit(sc);
        Account account = new Account(number, holder, balance);

        System.out.print("Account data:\n" + account + "\n");
        System.out.print("Enter a deposit value: ");
        account.deposit(sc.nextDouble());
        System.out.print("Updated data:\n" + account + "\n");
        System.out.print("Enter a withdraw value: ");
        account.withdraw(sc.nextDouble());
        System.out.print("Updated data:\n" + account + "\n");

        sc.close();
    }

    public static double readInitialDeposit(Scanner sc){
        char option;

        System.out.print("Is there a initial deposit? (y/n): ");
        option = Character.toLowerCase(sc.next().charAt(0));

        while(option != 'y' && option != 'n'){
            System.out.println("Not a valid option, try again (y/n): ");
            option = Character.toLowerCase(sc.next().charAt(0));
        }

        if(option == 'y'){
            System.out.print("Enter a initial deposit value: ");
            return sc.nextDouble();
        }else{
            return 0.0;
        }
    }
}
