package Capitulo03.Account;

import java.util.Scanner;

public class AccountTeste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account account1 = new Account("Willian Xavier", 1_000);
        Account account2 = new Account("John Mayer", -7.53);

        account1.withdrawal(-500);
        System.out.printf("Saldo: R$%.2f", account1.getBalance());

        System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f %n", account2.getName(), account2.getBalance());

        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f %n", account2.getName(), account2.getBalance());

        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
        account2.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f %n", account2.getName(), account2.getBalance());


//        System.out.printf("Initial name is: %s%n%n", myAccount.getName());
//        System.out.println("Please, enter the name: ");
//        String theName = input.nextLine();
//        myAccount.setName(theName);
//
//        System.out.printf("Name in object myAccount is: %n%s%n", myAccount.getName());
    }
}
