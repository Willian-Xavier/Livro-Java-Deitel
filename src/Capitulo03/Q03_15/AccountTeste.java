package Capitulo03.Q03_15;

import java.util.Scanner;

public class AccountTeste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account account1 = new Account("Willian Xavier", 1_000);
        Account account2 = new Account("John Mayer", -7.53);

        Account.displayAccount(account1);
        Account.displayAccount(account2);
    }
}
